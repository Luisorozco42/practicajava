package retos;

import java.util.Scanner;

public class CajeroAutomatico {
    static void main() {
        System.out.println("Bienvenido al cajero automatico");
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;
        var salir = false;

        while (!salir){
            System.out.printf("""
                    %nMenu
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir\s
                    """, saldo);
            var opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion){
                case 1 -> System.out.println("Su saldo es de: " + saldo);
                case 2 -> {
                    System.out.println("Cuanto dinero desea retirar?");
                    var retiro = Double.parseDouble(scanner.nextLine());
                    if (retiro <= saldo) saldo -= retiro;
                    else System.out.println("No tiene dinero suficiente para retirar el monto de " + retiro);
                }

                case 3 -> {
                    System.out.print("Ingrese la cantidad de dinero a depositar:\t");
                    var deposito = Double.parseDouble(scanner.nextLine());
                    if(deposito > 0) saldo += deposito;
                    else System.out.println("No puede depositar un valor un monto menor de 1 como: " + deposito);
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Esa no es una de las opciones establecidas");
            }
        }

    }
}
