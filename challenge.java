import java.util.*;
/**
 * challenge
 * Devolver la suma de elementos de un array. El nro 13 es de mala suerte asi que no debe sumarse.
 * Ignorar tambien el nro siguiente al 13.
 */
public class challenge {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int n;

        System.out.println("Ingrese la cantidad de nros a sumar");
        n = Teclado.nextInt();
        
        int[] numeros = new int[n];
        int sumanumeros = 0;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese numeros a sumar:");
            
            numeros[i] = Teclado.nextInt();

            if (numeros[i] == 13) {
                i++;

            } else {
                sumanumeros = sumanumeros + numeros[i];
            }

        }
        System.out.println("La suma de los nros es:" + sumanumeros);

    }

    
}