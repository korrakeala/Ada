import java.util.*;

public class Ejercicio00 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c;

        a = Teclado.nextInt();

        b = Teclado.nextInt();

        c = a * b;

        System.out.println("El resultado es: " + c);

    }
}