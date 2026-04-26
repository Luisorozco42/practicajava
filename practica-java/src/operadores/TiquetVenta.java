package operadores;

import java.util.Scanner;

public class TiquetVenta {
    static void main() {
        System.out.println("*** Generacion de Tiquet de Venta ***");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Precio Leche: ");
        var precioLeche = Double.parseDouble(scanner.nextLine());

        System.out.println("Precio Pan: ");
        var precioPan = Double.parseDouble(scanner.nextLine());

        System.out.println("Precio Lechuga: ");
        var precioLechuga = Double.parseDouble(scanner.nextLine());

        System.out.println("Precio Platano: ");
        var precioPlatano = Double.parseDouble(scanner.nextLine());

        System.out.println("Aplicar algun descuento (%)?");
        var descuentoPorcentaje = Integer.parseInt(scanner.nextLine());

        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatano;

        //aplicar descuento
        double descuento;
        descuento = subtotal * (descuentoPorcentaje / 100.0);
        var subTotalDescuento = subtotal - descuento;
        //impuestos del 16%
        var tiquetVenta = subTotalDescuento * 0.16 + subTotalDescuento;
        System.out.printf("""
                %nTiquet de Venta
                %n---------------
                Subtotal: %.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): %.2f
                Total: %.2f
                """, subtotal, descuento, descuentoPorcentaje, (subtotal * 0.16), tiquetVenta);
    }
}
