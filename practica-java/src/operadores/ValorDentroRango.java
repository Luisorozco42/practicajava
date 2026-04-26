package operadores;

import java.util.Scanner;

public class ValorDentroRango {
    static void main() {
        System.out.println("*** Valor dentro del Rango ***");
        final var MINIMO = 0;
        final var MAXIMO = 10;

        Scanner scanner = new Scanner(System.in);
        //solicitar un valor entre 0 y 10
        System.out.println("Ingrese un valor entre 0 y 10");
        var dato = Integer.parseInt(scanner.nextLine());
        //verificar si el dato esta dentro del rango
        var estaDentroRango = (dato >= MINIMO) && (dato <= MAXIMO);
        System.out.println("estaDentroRango = " + estaDentroRango);
    }
}
