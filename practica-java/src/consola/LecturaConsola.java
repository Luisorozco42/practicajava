package consola;

import java.util.Scanner;

public class LecturaConsola {
    static void main() {
        //introdicir valores por consola
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre:\t");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
