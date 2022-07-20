public class Impressao {

    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;


    public Impressao(int paginasTotais, int paginasColoridas, boolean ehFrenteVerso, double valorColoridasFrenteVerso, double valorPretoBrancoFrenteVerso, double valorColoridasFrenteApenas, double valorPretoBrancoFrenteApenas) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal() {
        if (ehFrenteVerso) {
            return paginasColoridas * valorColoridasFrenteVerso + (paginasTotais - paginasColoridas) * valorPretoBrancoFrenteVerso;
        }

        return paginasColoridas * valorColoridasFrenteApenas + (paginasTotais - paginasColoridas) * valorPretoBrancoFrenteApenas;
    }

    @Override
    public String toString() {

        String frenteVerso = ehFrenteVerso ? "frente e verso" : "frente apenas";

        return "total de paginas: " + paginasTotais +
                ", total coloridas: " + paginasColoridas +
                ", total preto e branco: " + (paginasTotais - paginasColoridas) +
                ", " + frenteVerso +
                ". total: R$ " + String.format("%.2f", calcularTotal());
    }


}
