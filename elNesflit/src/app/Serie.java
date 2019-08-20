package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Serie
 */
public class Serie extends Contenido {

    public List<Temporada> temporadas = new ArrayList<Temporada>();

	public Temporada getTemporada(int nro){
        //Recorrer cada temporada, si el nro de temporada del ciclo es igual a "nro", devolver esa temporada
        for (Temporada tempo : this.temporadas) {
            if (nro == tempo.nroTemporada) {
                return tempo;
            }
        }
        return null;
    }

}