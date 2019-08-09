import java.util.*;
//Ejercicio 4.12 (pasar de DFD a codigo)
public class Ejercicio06 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        double cez1 = 11.00; // costo por gramo
        double cez2 = 10.00;
        double cez3 = 12.00;
        double cez4 = 24.00;
        double cez5 = 27.00;

        double ce;

        System.out.println("Ingrese el nro de zona:");
        System.out.println("Para terminar ingrese 0");
        System.out.println(" ");
        int zona = Teclado.nextInt();

        while (zona > 0) {

            if (zona < 1 || zona > 5) {
                System.out.println("La zona ingresada no es valida.");
                System.out.println(" ");
            } else {

                System.out.println("Ingerese el peso en kilogramos:");
                double pesokg = Teclado.nextDouble();

                if (pesokg > 5) {
                    System.out.println(
                            "Entrega rechazada. El peso es mayor que el permitido por normativas de seguridad.");
                    System.out.println(" ");

                } else {
                    switch (zona) {
                    case 1:
                        ce = cez1 * (pesokg * 1000);
                        System.out.println("El cobro de la entrega es: $" + ce);
                        System.out.println(" ");
                        break;

                    case 2:
                        ce = cez2 * (pesokg * 1000);
                        System.out.println("El cobro de la entrega es: $" + ce);
                        System.out.println(" ");
                        break;

                    case 3:
                        ce = cez3 * (pesokg * 1000);
                        System.out.println("El cobro de la entrega es: $" + ce);
                        System.out.println(" ");
                        break;

                    case 4:
                        ce = cez4 * (pesokg * 1000);
                        System.out.println("El cobro de la en trega es: $" + ce);
                        System.out.println(" ");
                        break;

                    case 5:
                        ce = cez5 * (pesokg * 1000);
                        System.out.println("El cobro de la entrega es: $" + ce);
                        System.out.println(" ");
                        break;
                    }
                }

            }
            System.out.println("Ingrese el nro de zona:");   
            System.out.println("Para terminar ingrese 0");
            System.out.println(" ");
            zona = Teclado.nextInt();

        }

    }
}