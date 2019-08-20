package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {

    public int nroTemporada;
    public String nombreSerie;
    public List<Episodio> episodios = new ArrayList<Episodio>();


	public Episodio getEpisodioNro(int nro){
        
        for (Episodio epi : this.episodios) {
            if (nro == epi.nroEpisodio) {
                return epi;
            }
        }
        return null;
    }

    public Episodio getEpisodioStr(String nombreSerie){
        
        for (Episodio epi : this.episodios) {
            if (epi.titulo.equals(nombreSerie)) {
                return epi;
            }
        }
        return null;
    }

    public Websodio buscarWebsodio(String nombre){
        
        for (Episodio websodio : this.episodios) {
            if (websodio instanceof Websodio && websodio.titulo.equals(nombre)) {
                return (Websodio)websodio;
            }
        }
        return null;
    }

}