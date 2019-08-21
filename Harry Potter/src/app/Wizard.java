package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Wizard
 */
public class Wizard extends Persona{

    // Implementar Interface IHaceMagia
    public Escoba escoba;
    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public Poder poderInicial;
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public boolean MagoOscuro = false;// (si es magoOscuro -> todo su nivel Danio o Curacion x2)
    public int energiaMagica; // (aka Mana)
}