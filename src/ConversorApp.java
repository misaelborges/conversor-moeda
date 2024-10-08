import java.util.Scanner;

public class ConversorApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ExchangeRateApi exchangeRateApi = new ExchangeRateApi();
        int opcao = 0;

        while (true) {
            System.out.println("**********************************************");
            System.out.println("Seja bem-vindo(a) ao conversor de moedas =]");

            System.out.println("1) Dólar =>> Peso argentino"); //USD -> ARS
            System.out.println("2) Peso argentino =>> Dólar"); //ARS -> USD
            System.out.println("3) Dólar =>> Real brasileiro"); //USD -> BRL
            System.out.println("4) Real brasileiro =>> Dólar"); //BRL -> USD
            System.out.println("5) Dólar =>> Peso colombiano"); //USD -> COP
            System.out.println("6) Peso colombiano =>> Dólar"); //COP -> USD
            System.out.println("7) Sair");

            System.out.print("Escolha uma opção válida: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o '\n' deixado pelo nextInt()

            // Verifica se o usuário deseja sair
            if (opcao == 7) {
                System.out.println("Saindo do conversor. Até a próxima!");
                break;
            }

            System.out.print("Digite um amount que deseja converter: ");
            String amount = scanner.nextLine();

            String base_code = null;
            String target_code = null;

            switch (opcao) {
                case 1 -> {
                    base_code = "USD";
                    target_code = "ARS";
                }
                case 2 -> {
                    base_code = "ARS";
                    target_code = "USD";
                }
                case 3 -> {
                    base_code = "USD";
                    target_code = "BRL";
                }
                case 4 -> {
                    base_code = "BRL";
                    target_code = "USD";
                }
                case 5 -> {
                    base_code = "USD";
                    target_code = "COP";
                }
                case 6 -> {
                    base_code = "COP";
                    target_code = "USD";
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue; // Volta para o início do laço
                }
            }

            // Faz a conversão e exibe o resultado
            Moeda resposta = exchangeRateApi.converterMoeda(amount, base_code, target_code);
            System.out.println(resposta);
        }

    }
}
