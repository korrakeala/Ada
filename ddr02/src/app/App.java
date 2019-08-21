package app;

import java.util.*;

public class App {
    public static Scanner teclado = new Scanner(System.in);
    public static String nombre;
    public static int edad;
    public static char sexo;
    public static double peso;
    public static double altura;

    public static void main(String[] args) throws Exception {

        Entrada();
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Entrada();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Juana");
        persona3.setEdad(32);
        persona3.setSexo('f');
        persona3.setPeso(54.5);
        persona3.setAltura(1.67);
        
        
    }

    public static void Entrada() {
        System.out.println("Ingrese el nombre:");
        App.nombre = teclado.nextLine();
        System.out.println("Ingrese la edad:");
        App.edad = teclado.nextInt();
        System.out.println("Ingrese el sexo:");
        App.sexo = teclado.next().charAt(0);
        System.out.println("Ingrese el peso:");
        App.peso = teclado.nextDouble();
        System.out.println("Ingrese la altura:");
        App.altura = teclado.nextDouble();
    }

}