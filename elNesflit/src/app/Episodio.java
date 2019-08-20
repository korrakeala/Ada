package app;

/**
 * Episodio
 */
public class Episodio {

    public int nroEpisodio;
    public String titulo;
    public int duracionMin;
    public int nroTemporada;

	public void reproducir(){
        System.out.println("Reproduciendo " + this.titulo);
    }
}