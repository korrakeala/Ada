//Dado un conjunto de 15 valores positivos, desarrollar un programa que imprima el
//valor maximo dentro del conjunto y su posicion relativa.
import java.util.*;

public class Ejercicio04 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int vmax = 0; //Valor Maximo
        int ivmax = 0; //Posicion relativa valor maximo

         for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el valor número " + (i + 1));

            int valor = Teclado.nextInt();

            if (valor >= vmax) {

                vmax = valor;
                ivmax = i + 1;
                
            }
        }
        System.out.println("El valor máximo es " + vmax + ".");
        System.out.println("La posición relativa del valor máximo es " + ivmax + ".");
    }
}