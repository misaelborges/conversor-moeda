import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApi {

    private static final HttpClient CLIENT = HttpClient.newHttpClient();

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public Moeda converterMoeda(String amount, String base_code, String target_code) {

        String apiKey = "d509114763d81073760db54e";
        String uri = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+base_code+"/"+target_code+"/"+amount;

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        try {
            HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

            // Deserializar JSON para Moeda
            Moeda moeda = GSON.fromJson(response.body(), Moeda.class);

            // Definir o valor original
            moeda.setValorOriginal(Double.parseDouble(amount));

            return moeda;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao conectar à API ou processar a resposta: " + e.getMessage());
        }

    }

}
