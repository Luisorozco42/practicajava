package operadores;

import java.util.Scanner;

public class PrestamoLibros {
    static void main() {
        System.out.println("*** Sistema de prestamo de libros ***");
        final var DISTANCIA_PERMITIDA = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuentas con credencial de estudiante? (true/false)");
        var tieneCredencial = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("A cuantos km vives de la biblioteca?");
        var distanciaVivienda = Integer.parseInt(scanner.nextLine());

        var esElegiblePrestamo = tieneCredencial || (distanciaVivienda <= DISTANCIA_PERMITIDA);

        System.out.println("esElegiblePrestamo = " + esElegiblePrestamo);
    }
}
