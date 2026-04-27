package sentencias;

import java.util.Scanner;

public class EstacionAnioSwitch {
    static void main() {
        System.out.println("*** Bienvenido al sistema que identifica la estacion del año:\t");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero que representa el mes en el que esta:\n");
        var mes = Integer.parseInt(scanner.nextLine());

        String estacion = switch (mes){
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "El mes proporcionado no existe y no tiene estacion";
        };

        System.out.println("estacion = " + estacion);
    }
}
