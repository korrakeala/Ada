/** 14. Realice un algoritmo que, con base en una calificación proporcionada
 (0-10), indique con letra la calificación que le corresponde: 10 es “A”, 9 es
 “B”, 8 es “C”, 7 y 6 son “D”, y de 5 a 0 son “F”. Represente el diagrama de
 flujo y el pseudocódigo.
 */
import java.util.*;

public class Ejercicio08 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese la calificacion numerica de 1 a 10:");
        System.out.println("Para salir, ingrese 11");
        double calif = Teclado.nextDouble();

        while (calif <= 10) {
            if (calif == 10) {
                System.out.println("La calificacion es A");
            } else {
                if (calif >= 9 && calif < 10) {
                    System.out.println("La calificacion es B");
                } else {
                    if (calif >= 8 && calif < 9) {
                        System.out.println("La calificacion es C");
                    } else {
                        if (calif >= 6 && calif < 8) {
                            System.out.println("La calificacion es D");
                        } else {
                            System.out.println("La calificacion es F");
                        }

                    }
                }
            }
            System.out.println("Ingrese la calificacion numerica de 1 a 10:");
            System.out.println("Para salir, ingrese 11");
            calif = Teclado.nextDouble();
        }
        System.out.println("EXIT");
    }

}