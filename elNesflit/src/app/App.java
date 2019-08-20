package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Catalogo");
        Netflix.InicializarCatalogo();

        Serie bb = Netflix.buscarSerie("Breaking Bad");

        Temporada laMejoTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejoTemporada.buscarWebsodio("Titulo websodio");

        elTop.reproducir();
    }
}