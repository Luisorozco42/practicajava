package sentencias;

import java.util.Scanner;

public class SistemaBancario {
    static void main() {
        System.out.println("*** Bienvenido al sistema Bancario ***");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseas salir del sistema (true/false)?");
        var salirSistema = Boolean.parseBoolean(scanner.nextLine());
        if(!salirSistema){
            System.out.println("Continuamos dentro del sistema...");
        }else {
            System.out.println("Saliendo del sistema...");
        }
    }
}
