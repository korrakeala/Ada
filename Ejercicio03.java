import java.util.Scanner;

public class Ejercicio03 {
    
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int ccat1 = 0; //contador categoria 1
        int ccat2 = 0;
        int ccat3 = 0;
        int ccat4 = 0;

        System.out.println("Ingrese los sueldos a categorizar:");

        double sueldo = Teclado.nextDouble();

        while (sueldo > 0) {
            if (sueldo < 520) {

                ccat4++;
                
            } else {
                if (sueldo >= 520 && sueldo < 780) {

                    ccat3++;
                    
                } else {
                    if (sueldo >= 780 && sueldo < 999) {

                        ccat2++;
                        
                    } else {

                        ccat1++;
                        
                    }
                    
                }
                
            }
            sueldo = Teclado.nextDouble();   
        }
        System.out.println("Categoría 1 (más de $999): "+ ccat1);
        System.out.println("Categoría 2 (entre $780 y $999): "+ ccat2);
        System.out.println("Categoría 3 (entre $520 y $780): "+ ccat3);
        System.out.println("Categoría 4 (menos de $520): "+ ccat4);

        


    }


    
}