package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Catalogo");
        Netflix.InicializarCatalogo();

        Serie bb = Netflix.buscarSerie("Breaking Bad");

        Temporada laMejorTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.buscarWebsodio("Titulo websodio");

        elTop.reproducir();
    }
}