package retos;

import java.util.Scanner;

public class SistemaEnvios {
    static void main() {
        System.out.println("*** Bienvenido al sistema de envios");
        final var NACIONAL = 10.0;
        final var INTERNACIONAL = 20.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el destino del envio (Nacional/Internacional):\t");
        var destino = scanner.nextLine();
        System.out.print("Ingrese el peso del paquete (kg):\t");
        var peso = Double.parseDouble(scanner.nextLine());

        var mensaje = (destino.toLowerCase() == "nacional") ?
                "El costo del envio del paquete es: " + NACIONAL * peso :
                "El costo del encio del paquete es: " + INTERNACIONAL * peso;
        System.out.println(mensaje);
    }
}
