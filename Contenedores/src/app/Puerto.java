package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Puerto
 */
public class Puerto {

    int nropuerto;
    String pais;
    public List<Contenedor> contenedores = new ArrayList<Contenedor>();

    public Puerto(int nrop, String pais) {
    this.nropuerto = nrop;
    this.pais = pais;
	}

}