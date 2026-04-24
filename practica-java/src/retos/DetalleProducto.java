package retos;

public class DetalleProducto {
    static void main() {
        //Tercer reto del curso toca poner variables y definirlas, luego cambiar el valor de cada una
        //se imprimen 2 veces
        String nombreProducto = "Churritos Diana";
        double precioProducto = 10.5;
        int cantidadDisponible = 25;
        boolean estaDisponible = true;
        System.out.println("Nombre del Producto: " + nombreProducto + "\n" +
                "Precio: " + precioProducto + "\n" +
                "Cantidad disponible: " + cantidadDisponible + "m\n" +
                "Disponibbilidad: " + estaDisponible + "\n");

        nombreProducto = "Jalapeños Diana";
        precioProducto = 10.0;
        cantidadDisponible = 0;
        estaDisponible = false;

        System.out.println("Nombre del Producto: " + nombreProducto + "\n" +
                "Precio: " + precioProducto + "\n" +
                "Cantidad disponible: " + cantidadDisponible + "m\n" +
                "Disponibbilidad: " + estaDisponible + "\n");

    }
}
