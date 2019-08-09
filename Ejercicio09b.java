import java.util.*;
// Dado un nro que representa un año, imprimir si es anio bisiesto o no.
public class Ejercicio09b {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un año para saber si es bisiesto:");
        int a = Teclado.nextInt();

        if (esAnioBisiesto(a)) {
            System.out.println("Es año bisiesto");            
        } else {
            System.out.println("No es año bisiesto");            
        }

    }
    private static boolean esAnioBisiesto(int anio){
        return (anio % 4 == 0 && (anio % 400 == 0 || anio % 100 != 0));
    }

}