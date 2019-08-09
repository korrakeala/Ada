import java.util.*;

public class Ejercicio02 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        a = Teclado.nextInt();
        b = Teclado.nextInt();

        if (a > b) {

            System.out.println(a +" es mayor que "+ b);
                
        } else {
            if (a < b) {
                
                System.out.println(a +" es menor que "+ b);
            
            } else {
                
                System.out.println(a +" es igual a "+ b);
            
            }
        }
    }
}