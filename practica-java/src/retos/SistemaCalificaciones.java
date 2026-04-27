package retos;

import java.util.Scanner;

public class SistemaCalificaciones {
    static void main() {

        System.out.println("*** Bienvenido al sistema de calificaciones ***");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota del estudiante:\t");
        var nota = Double.parseDouble(scanner.nextLine());

        if(nota <= 10.0 && nota >= 9.0) System.out.println("Su calificacion es una A");
        else if (nota < 9.0  && nota >= 8.0) System.out.println("Su calificaciones es una B");
        else if (nota < 8.0 && nota >= 7.0) System.out.println("Su calificaciones es una C");
        else if (nota < 7.0 && nota >= 6.0) System.out.println("Su calificaciones es una D");
        else if (nota < 6.0 && nota >= 0.0) System.out.println("Su calificacion es una F");
        else System.out.println("Valor desconocido");

    }
}
