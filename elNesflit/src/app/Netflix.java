package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Netflix
 */
public class Netflix {

    public static List<Peli> CatalogoPelis = new ArrayList<Peli>();
    public static List<Serie> CatalogoSeries = new ArrayList<Serie>();

    public static Serie buscarSerie(String nombre){
        
        for (Serie serie : Netflix.CatalogoSeries) {
            if (serie.nombre.equals(nombre)) {
                return serie;
            }
        }
        return null;
    }

    public static Peli buscarPeli(String nombre){
        
        for (Peli peli : Netflix.CatalogoPelis) {
            if (peli.nombre.equals(nombre)) {
                return peli;
            }
        }
        return null;
    }

        //agregar episodio + temporada + serie y agregar al catalogo
    public static void InicializarCatalogo(){
        Netflix.agregarBreakingBad();
    }

    public static void agregarBreakingBad(){
        Serie breakingBad = new Serie();
        breakingBad.nombre = "Breaking Bad";
        breakingBad.anio = 2008;
        breakingBad.genero = "Drama";

        Netflix.CatalogoSeries.add(breakingBad);

        Temporada temporada01 = new Temporada();
        temporada01.nombreSerie = "Breaking Bad";
        temporada01.nroTemporada = 1;

        breakingBad.temporadas.add(temporada01);
        
        Episodio episodio = new Episodio();
        episodio.titulo = "Titulo ep1";
        episodio.nroTemporada = 1;
        episodio.nroEpisodio = 1;
        episodio.duracionMin = 41;
        
        temporada01.episodios.add(episodio);

        episodio = new Episodio();
        episodio.titulo = "Titulo ep2";
        episodio.nroTemporada = 1;
        episodio.nroEpisodio = 2;
        episodio.duracionMin = 39;

        temporada01.episodios.add(episodio);
  
        Websodio websodio = new Websodio();
        websodio.titulo = "Titulo websodio";
        websodio.duracionMin = 14;

        temporada01.episodios.add(websodio);

    }


}