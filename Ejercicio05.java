import java.util.*;

public class Ejercicio05 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el numero de ventas:");
        double n = Teclado.nextDouble(); //nro de ventas

        int a = 0; //Ventas mayores a mil
        int b = 0; //Ventas mayores a quinientos pero menores o iguales a mil
        int c = 0; //Ventas menores o iguales a quinientos

        double t1 = 0; //total de las ventas tipo a
        double t2 = 0; //total de las ventas tipo b
        double t3 = 0; //total de las ventas tipo c

        double tt = 0; //total de las ventas
        double cn = 1; //contador de las ventas

        System.out.println("Ingrese el monto de la venta:");
        double v = Teclado.nextDouble(); //monto de la venta

        while (cn < n) {
            if (v > 1000) {
                a++;
                t1 = t1 + v;                
            } else {
                if (v > 500) {
                    b++;
                    t2 = t2 + v;                    
                } else {
                    c++;
                    t3 = t2 + v;                    
                }
            }
            tt = tt + v;
            cn = cn + 1;
            System.out.println("Ingrese el monto de la venta:");
            v = Teclado.nextDouble();            
        }
        System.out.println("Las ventas y el total de ventas 1 es: "+ a +" "+ t1);
        System.out.println("Las ventas y el total de ventas 2 es: "+ b +" "+ t2);
        System.out.println("Las ventas y el total de ventas 3 es: "+ c +" "+ t3);
        System.out.println("El total de las ventas es: "+ tt);
    }
}