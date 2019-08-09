import java.util.*;

public class Ejercicio01 {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        double a, b, c, d, f;
        
        a = Teclado.nextDouble();
        b = Teclado.nextDouble();
        c = Teclado.nextDouble();

        d=a+b+c;
        
        f= d/3d;
        
        System.out.println("El promedio es: " + f);
        
    }


}
