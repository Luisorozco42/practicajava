package arreglos;

import java.util.Scanner;

public class ArregloDinamico {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //declarar el arreglo
        System.out.print("Proporciona el largo del arreglo:\t");
        var espacioArreglo = Integer.parseInt(scanner.nextLine());
        var array = new int[espacioArreglo];
        int contador = 1;

        for (int i = 0; i < espacioArreglo; i++){
            System.out.print("Proporcione enteros[" + i + "] = " );
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        //Imprimir los valores del arreglo
        for (int arreglo : array) {
            System.out.println("Valor " + contador++ + " = " + arreglo);
        }
    }
}
