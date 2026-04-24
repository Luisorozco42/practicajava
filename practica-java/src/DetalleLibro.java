public class DetalleLibro {
    static void main() {
        //Detalle de un libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        //Mismo caso, el warning se debe a que libroDisponible no se define de manera logica si no directa
        String libroDisponibletxt = (libroDisponible) ? "Está disponible" : "No está disponible";
        double precio = 500.5;

        System.out.println("Título del Libro: " + tituloLibro + "\n" +
                "Año de pubicación: " + anioPublicacion + "\n" +
                "Disponibilidad del libro: " + libroDisponibletxt + "\n" +
                "Precio: " + precio);

        //Modificar laa variable de tituloLibro
        tituloLibro = "El Señor de los Anillos";

        System.out.println(tituloLibro);
        /*
        La existencia del codigo de arriba es por la explicacion de las memorias stack y heap, debido a que los Strings
        son objetos y tienen una forma distintas a la hora de almacenar datos en memoria a diferencia de los otros tipos
        de variales que usan solo memoria stack. Dando esto a entender que para un objeto se usan los 2 tipos de memoria

        Cabe a destacar que la basura queda, en otras palabras siempre queda basura al usar la memoria heap.
        La maquina virtual de java se encarga de ejacutar de manera automatica el recolector de basura para no saturar
        memoria de la maquina.
         */
    }
}
