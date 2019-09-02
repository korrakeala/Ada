package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Cuenta
 */
public class Cuenta {

    public List<Movimiento> movimientos = new ArrayList<Movimiento>();
    
    public String nroCuenta;
    public String tipoCuenta;
    public Dinero dinero;
    public double montoTotal;
}