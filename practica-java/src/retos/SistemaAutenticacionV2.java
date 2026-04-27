package retos;

import java.util.Scanner;

public class SistemaAutenticacionV2 {
    static void main() {
        System.out.println("*** Sistema de autenticacion ***");
        final String USER = "JhonDoe", PASS = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        var user = scanner.nextLine();
        System.out.println("Ingrese su contraseña");
        var pass = scanner.nextLine();

        if(USER.equals(user) && PASS.equals(pass)) System.out.println("Bienvenido al sistema");
        else if (!user.equals(USER) && pass.equals(PASS)) System.out.println("Usuario invalido debe modificar su valor");
        else if (user.equals(USER)) System.out.println("La contraseña es invalida debe modificar su valor");
        else System.out.println("Ambos son invalidos debe cambiar ambos valores");

    }
}
