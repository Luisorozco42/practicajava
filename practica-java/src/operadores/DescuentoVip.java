package operadores;

import java.util.Scanner;

public class DescuentoVip {
    static void main() {
        System.out.println("*** Sistema de descuento VIP ***");
        final var NUM_PRODUCTO_DESCUENTO = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos productos compraste hoy?");
        var cantProductos = Integer.parseInt(scanner.nextLine());
        System.out.println("Tienes la membresia de la tienda? (true/false)");
        var tieneMemebresia = Boolean.parseBoolean(scanner.nextLine());

        var esElegibleDescuento = (cantProductos >= NUM_PRODUCTO_DESCUENTO) && (tieneMemebresia == true);
        System.out.println("Tienes acceso al descuento vip? " + esElegibleDescuento);
    }
}
