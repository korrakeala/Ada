package app;
/*
* Conculta para clase: cuando cargo varios objetos de una lista con la
* misma variable, como hago para acceder a un objeto determinado despues?
*/
public class Cuenta {

    private String titular;
    private double cantidad;

    //Consultar como hacer para que sirvan los dos constructores.
    //Sobrecarga? lo escribi y me daba error, copypastee y anduvo.

    public Cuenta(String titular) {
        this(titular, 0); //Sobrecarga?
    }

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta [cantidad=" + cantidad + ", titular=" + titular + "]";
    }

    public void ingresar (double cantidad){
        if (cantidad > 0) {
            this.cantidad += cantidad;            
        }
    }

    public void retirar (double cantidad){
        if ((this.cantidad - cantidad) < 0) {
            this.cantidad = 0;            
        } else {
            this.cantidad -= cantidad;
        }
    }
    
}