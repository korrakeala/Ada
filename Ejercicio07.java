/** 4. El dueño de un estacionamiento requiere un diagrama de flujo con el
 algoritmo que le permita determinar cuánto debe cobrar por el uso del
 estacionamiento a sus clientes. Las tarifas que se tienen son las siguientes:
 a. Las dos primeras horas a $5.00 c/u. b. Las siguientes tres a $4.00 c/u. c.
 Las cinco siguientes a $3.00 c/u. d. Después de diez horas el costo por cada
 una es de dos pesos.
 */
import java.util.*;

public class Ejercicio07 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese las hs de estadia:");
        double canths = Teclado.nextDouble();

        double tarifa1 = 5.00;
        double completo1 = tarifa1 * 2;
        double tarifa2 = 4.00;
        double completo2 = tarifa2 * 3;
        double tarifa3 = 3.00;
        double completo3 = tarifa3 * 5;
        double tarifa4 = 2.00;

        while (canths > 0) {

            if (canths > 0 && canths < 2) {
                double totaltarifa1 = canths * tarifa1;
                System.out.println("El total a cobrar es: " + totaltarifa1);

            } else {
                if (canths > 2 && canths <= 5) {
                    double totaltarifa2 = completo1 + ((canths - 2) * tarifa2);
                    System.out.println("El total a cobrar es: " + totaltarifa2);

                } else {
                    if (canths > 5 && canths <= 10) {
                        double totaltarifa3 = completo1 + completo2 + ((canths - 5) * tarifa3);
                        System.out.println("El total a cobrar es: " + totaltarifa3);

                    } else {
                        double totaltarifa4 = completo1 + completo2 + completo3 + ((canths - 10) * tarifa4);
                        System.out.println("El total a cobrar es: " + totaltarifa4);

                    }

                }

            }
            System.out.println("Ingrese las hs de estadia:");
            System.out.println("Para terminar ingrese 0");
            canths = Teclado.nextDouble();
        }
    }

}