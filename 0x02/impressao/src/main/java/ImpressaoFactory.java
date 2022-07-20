public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanho, int totalPaginas, int paginasColoridas, boolean ehFrenteVerso) {
        switch(tamanho) {
            case A2:
                return new Impressao(totalPaginas, paginasColoridas, ehFrenteVerso, 0.28, 0.18, 0.32, 0.22);
            case A3:
                return new Impressao(totalPaginas, paginasColoridas, ehFrenteVerso, 0.25, 0.15, 0.30, 0.20);
            case A4:
                return new Impressao(totalPaginas, paginasColoridas, ehFrenteVerso, 0.20, 0.10, 0.25, 0.15);
            default:
                return null;
        }
    }

}