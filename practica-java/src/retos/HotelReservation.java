package retos;

import java.util.Scanner;

public class HotelReservation {
    static void main() {
        System.out.println("*** Bienvenido al sistema de reservación en un hotel ***");
        final double VISTA_MAR = 190.50;
        final double SIN_VISTA_MAR = 150.50;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es su nombre?");
        var nombre = scanner.nextLine();
        System.out.println("Por cuanto sera su estadía?");
        var diasEstadia = Integer.parseInt(scanner.nextLine());
        System.out.println("Desea que tenga vista al mar? (true/false)");
        var tieneVistaMar = Boolean.parseBoolean(scanner.nextLine());

        var costoTotal = (tieneVistaMar) ? diasEstadia * VISTA_MAR : diasEstadia * SIN_VISTA_MAR;

        System.out.printf("""
                %nLa reserva se ha realizado correctamente
                El nombre de la reserva esta dado a: %s
                La cantidad de dias de estadia son: %d
                Se selecciono que tuviese vista al mar: %s
                -------------------------------------------
                El monto total de la reserva es: %.2f
                """, nombre, diasEstadia, tieneVistaMar, costoTotal);
    }
}
