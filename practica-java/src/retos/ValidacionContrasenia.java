package retos;

import java.util.Scanner;

public class ValidacionContrasenia {
    static void main() {
        //validador de contraseñas
        //unica condicion debe tener 6 caracteres en total
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Bienvenido al validador de Contraseñas");
        var contrasenia = "";
        do {
            System.out.print("Ingrese la contraseña que desea validar:\t");
            contrasenia = scanner.nextLine();
            if (contrasenia.length() < 6) System.out.println("Contraseña invalida");
        }while (contrasenia.length() < 6);
        System.out.println("Contraseña valida");
    }
}
