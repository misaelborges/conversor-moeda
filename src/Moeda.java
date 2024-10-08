public class Moeda {

    private Double conversion_result; // Valor convertido
    private Double valorOriginal;     // Valor original
    private String base_code;         // Moeda original
    private String target_code;       // Moeda alvo

    public Double getConversionResult() {
        return conversion_result;
    }

    public void setConversionResult(Double conversion_result) {
        this.conversion_result = conversion_result;
    }

    public Double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(Double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public String getBaseCode() {
        return base_code;
    }

    public void setBaseCode(String base_code) {
        this.base_code = base_code;
    }

    public String getTargetCode() {
        return target_code;
    }

    public void setTargetCode(String target_code) {
        this.target_code = target_code;
    }

    @Override
    public String toString() {
        return String.format("Valor %.2f [%s] corresponde ao valor final de = %.2f [%s]",
                getValorOriginal(), getBaseCode(), getConversionResult(), getTargetCode());
    }
}
