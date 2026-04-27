package retos;

import com.sun.source.doctree.EscapeTree;

import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    static void main() {
        System.out.println("*** Bienvenido al sistema de Adivinanzas ***");
        System.out.println("El juego consiste en que adivines un numero entre el 1 y el 50");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        final int MAX_INTENTOS = 5;

        int numeroSecreto = random.nextInt(50) + 1;
        int intento = 1;

        while (intento <= MAX_INTENTOS){
            System.out.println("Ingresa tu intento nr. " + intento);
            var numeroIntento = Integer.parseInt(scanner.nextLine());

            if (numeroIntento == numeroSecreto){
                System.out.println("Felicidades!!!");
                System.out.println("Has encontrado el numero secreto con un numero de intentos de:\t" + intento);
                break;
            }else if (numeroIntento < numeroSecreto) System.out.println("Buen intento pero el numero " +
                    numeroIntento + " es menor que el numero secreto");
            else System.out.println("Buen intento pero el numero " +
                        numeroIntento + " es mayor que el numero secreto");

            intento++;

        }

        if (intento > MAX_INTENTOS){
            System.out.println("Cantidad de intentos maximos alcanzados, el numero secreto era: " + numeroSecreto);
        }
    }
}
