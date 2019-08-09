import java.util.*;
/**
 * challenge2
 */
public class challenge2 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int n;
        int suma = 0;

        System.out.println("Ingrese cant nros");
        n = Teclado.nextInt();

        boolean hay13 = false;

        int[] nros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nro");

            nros[i] = Teclado.nextInt();            
        }

        for (int i = 0; i < n; i++) {
            if (nros[i] == 13) {
                hay13 = true; //esta tecnica se llama flag
            } else {
                if (!hay13) {
                    suma = suma + nros[i];
                } else {
                    hay13 = false;
                }
            }
        }
        System.out.println("La suma es " + suma);
    }    
}