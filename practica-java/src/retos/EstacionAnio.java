package retos;

import java.util.Scanner;

public class EstacionAnio {
    static void main() {
        System.out.println("*** Bienvenido al sistema que identifica la estacion del año:\t");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero que representa el mes en el que esta:\n");
        var mes = Integer.parseInt(scanner.nextLine());

        if(mes == 1 || mes == 2 || mes == 12)
            System.out.println("Es la estacion de invierno");
        else if(mes >= 3 && mes <= 5) System.out.println("Es la estacion de Primavera");
        else if(mes >= 6 && mes < 9) System.out.println("Es la estacion de Verano");
        else if(mes >= 9 && mes < 12) System.out.println("Es la estacion de Otoño");
        else System.out.println("Mes desconocido");
    }
}
