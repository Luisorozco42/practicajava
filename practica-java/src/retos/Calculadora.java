package retos;

import java.util.Scanner;

public class Calculadora {
    static void main() {
        System.out.println("*** Bienvenido a su calculadora personal ***");
        Scanner scanner = new Scanner(System.in);
        var salir = false;

        while (!salir){
            System.out.println("""
                    %nMenu
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Escoge una opcion:\s
                    """);
            var opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion){
                case 1 -> {
                    System.out.print("Ingrese el primer operando:\t");
                    var operando1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingrese el segundo operando:\t");
                    var operando2 = Double.parseDouble(scanner.nextLine());

                    System.out.println("La suma de de los dos operando da el resultado de:\t" + (operando2 + operando1));
                }

                case 2 ->{
                    System.out.print("Ingrese el primer operando:\t");
                    var operando1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingrese el segundo operando:\t");
                    var operando2 = Double.parseDouble(scanner.nextLine());

                    System.out.println("La resta de de los dos operando da el resultado de:\t" + (operando1 - operando2));
                }

                case 3 -> {
                    System.out.print("Ingrese el primer operando:\t");
                    var operando1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingrese el segundo operando:\t");
                    var operando2 = Double.parseDouble(scanner.nextLine());

                    System.out.println("La multiplicacion de de los dos operando da el resultado de:\t"
                            + (operando1 * operando2));
                }

                case 4 -> {
                    System.out.print("Ingrese el primer operando:\t");
                    var operando1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Ingrese el segundo operando:\t");
                    var operando2 = Double.parseDouble(scanner.nextLine());
                    
                    if (operando2 == 0)
                        System.out.println("No se puede dividir entre " + operando2);
                    else System.out.println("La division de de los dos operando da el resultado de:\t"
                            + (operando1 / operando2));
                }
                case 5 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("La opcion ingresada no es valida");
            }
        }
    }
}
