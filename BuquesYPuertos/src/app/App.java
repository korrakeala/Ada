package app;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando Buques y Puertos");

        Buque barquito = Buque.NuevoBuqueCargado();

        for (Contenedor contenedorcito : barquito.losContenedores) {
            switch (contenedorcito.puertoArribo.nroPuerto) {
                case 1:
                    Puerto.BuscaPuerto(1).contenedoresARecibir.add(contenedorcito);
                    break;
                
                case 2:
                    Puerto.BuscaPuerto(2).contenedoresARecibir.add(contenedorcito);
                    break;

                case 3:
                    Puerto.BuscaPuerto(3).contenedoresARecibir.add(contenedorcito);
                    break;

            }
        }

        for (Puerto puertito : Puerto.PuertosDelMundo) {
            System.out.println("El puerto " + puertito.nombre + " recibira " + puertito.contenedoresARecibir.size());
            //size es a listas como length a arrays
        }

        System.out.println("El peso del barco " + barquito.nombre + " es " + barquito.calcularPeso());

        Contenedor elConteMasPesado = barquito.getContenedorMaximo();
        System.out.println("El contenedor mas pesado es " + elConteMasPesado.idContenedor + 
        " cuyo peso es " + elConteMasPesado.peso);
        
    }
}