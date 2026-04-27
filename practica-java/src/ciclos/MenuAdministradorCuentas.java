package ciclos;

import java.util.Scanner;

public class MenuAdministradorCuentas {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        var salir = false;
        //iteracion del menu
        while (!salir){
            System.out.println("""
                    *** Sistema de administracion de cuentas ***
                    Menu:
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    Escoge una opcion:\s
                    """);
            var opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion){
                case 1 -> System.out.println("Creando cuenta...\n");
                case 2 -> System.out.println("Eliminando cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida\n");
            }
        }
    }
}
