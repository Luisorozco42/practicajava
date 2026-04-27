package retos;

import java.util.Scanner;

public class MayorDosNumeros {
    static void main() {
        System.out.println("*** Bienvenido al sitema para ver cual de los 2 nums es el mayor ***");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero:\t");
        var num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el segundo numero:\t");
        var num2 = Integer.parseInt(scanner.nextLine());

        var resultado = (num1 > num2) ? "El primer numero es mayor: "
                                        + num1 : (num2 > num1) ? "El segundo numero es mayor: "
                                                                 + num2 : "Los numeros son iguales";
        System.out.println(resultado);
    }
}
