package sentencias;

import java.util.Scanner;

public class SaludFitness {
    static void main() {
        System.out.println("*** Salud y Fitness");
        //constantes
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04; //valor aproximado, son kilocalorias

        //pedimos los valores al usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        var nombre = scanner.nextLine();

        System.out.println("Cuantos pasos has caminado hoy?");
        var pasos = Integer.parseInt(scanner.nextLine());

        //verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzada = (META_PASOS_DIARIO == pasos) ? "Si :)" : "No :(";

        //calculamos las calorias quemadas
        var caloriasQuemadas = CALORIAS_POR_PASO * pasos;
        System.out.println("caloriasQuemadas = " + caloriasQuemadas);

        //Desplegamos la información
        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta pasos diarios alcanzada: %s
                ----------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombre, pasos, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO);
    }
}
