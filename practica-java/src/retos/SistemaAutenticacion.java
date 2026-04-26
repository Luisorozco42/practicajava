package retos;

import java.util.Scanner;

public class SistemaAutenticacion {
    static void main() {
        System.out.println("*** Bienvenido al sistema de Autenticacion ***");
        final var USER = "JhonDoe";
        final var PASSWORD = "Jhon123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu usuario?");
        var user = scanner.nextLine();
        System.out.println("Cual es tu contraseña?");
        var pass = scanner.nextLine();

        var esAutenticable = (user.equals(USER)) && (pass.equals(PASSWORD));
        System.out.println("Datos son correctos?\t" + esAutenticable);

    }
}
