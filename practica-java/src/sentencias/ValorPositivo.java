package sentencias;

import java.util.Scanner;

public class ValorPositivo {
    static void main() {
        System.out.println("*** Sistema de valor positivo ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un digito");
        var digito = Integer.parseInt(scanner.nextLine());

        if(digito < 0) System.out.println("El digito proporcionado es negativo: " + digito);
        else if (digito > 0) System.out.println("El digito es positivo: " + digito);
        else System.out.println("El digito es 0: " + digito);
    }
}
