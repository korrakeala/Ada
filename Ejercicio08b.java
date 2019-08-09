import java.util.*;

public class Ejercicio08b {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese la calificacion numerica de 1 a 10:");
        System.out.println("Para salir, ingrese 11");
        int calif = Teclado.nextInt();

        while (calif <= 10) {
                switch (calif) {
                case 10:
                    System.out.println("La calificacion es A");
                    break;
                case 9:
                    System.out.println("La calificacion es B");
                    break;
                case 8:
                    System.out.println("La calificacion es C");
                    break;
                case 7:
                case 6:
                    System.out.println("La calificacion es D");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("La calificacion es F");
                    break;
                }

            System.out.println("Ingrese la calificacion numerica de 1 a 10:");
            System.out.println("Para salir, ingrese 11");
            calif = Teclado.nextInt();
        }
        System.out.println("EXIT");

    }
}