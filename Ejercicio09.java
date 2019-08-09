import java.util.*;
// Dado un nro que representa un año, imprimir si es anio bisiesto o no.
public class Ejercicio09 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un año para saber si es bisiesto:");
        int a = Teclado.nextInt();

        boolean bisiesto = esAnioBisiesto(a);
        System.out.println("¿El año es bisiesto? " + bisiesto);
    }

    private static boolean esAnioBisiesto(int anio){
        return (anio % 4 == 0 && (anio % 400 == 0 || anio % 100 != 0));
    }
    
}