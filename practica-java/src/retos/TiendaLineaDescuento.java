package retos;

import java.util.Scanner;

public class TiendaLineaDescuento {
    static void main() {
        System.out.println("*** Bienvenido a la tienda en linea ***");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cual fue el monto de tu compra:\t");
        var monto = Double.parseDouble(scanner.nextLine());
        System.out.print("Eres miembro de la tienda:\t");
        var esMiembro = Boolean.parseBoolean(scanner.nextLine());

        if(monto > 1000 && esMiembro) {
            System.out.println("\nFelicidades, has obtenido un escuento del 10%");
            System.out.println("Monto de la compra: " + monto + "\n" +
                    "Monto descuento: " + (monto * 0.10) + "\n" +
                    "Monto final de la compra con descuento: " + (monto - monto * 0.10));
        } else if (esMiembro){
            System.out.println("\nFelicidades, has obtenido un escuento del 5%");
            System.out.println("Monto de la compra: " + monto + "\n" +
                    "Monto descuento: " + (monto * 5/100) + "\n" +
                    "Monto final de la compra con descuento: " + (monto - monto * 5/100));
        }
        else System.out.println("\nNo obtuviste ningun tipo de descuento\n" +
                    "Te invitamos a hacerte miembro de la tienda\n" +
                    "Monto final de la compra: " + monto);

    }
}
