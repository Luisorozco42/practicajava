package retos;

import java.util.Scanner;

public class RecetasCocina {
    static void main() {
        System.out.println("*** Recetas de cocina ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingrese los ingredientes: ");
        var ingredientes = consola.nextLine();
        System.out.print("Ingrese el tiempo de Preparacion: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese la dificultad: ");
        var dificultad = consola.nextLine();

        System.out.println("--- Receta de Cocina ---\n" +
                "Nombre receta: " + nombreReceta + "\n" +
                "Ingredientes: " + ingredientes + "\n" +
                "Tiempo de preparacion: " + tiempoPreparacion + "\n" +
                "Dificultad: " + dificultad);
    }
}
