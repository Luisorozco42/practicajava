package operadores;

import java.util.Scanner;

public class RangoVariable {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entero");
        var dato = Integer.parseInt(scanner.nextLine());
        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("estaDentroRango = " + estaDentroRango);

        //revisar logica inversa
        var estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("estaFueraRango = " + estaFueraRango);

    }
}
