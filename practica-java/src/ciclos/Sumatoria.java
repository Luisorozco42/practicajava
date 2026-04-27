package ciclos;

import java.util.Scanner;

public class Sumatoria {
    static void main() {
        // hay varias formas de como hacer este ejercicio dejaré mi version y la version del curso
        //mi version
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de los primeros x numero que quiere que se sumen");
        var x = Integer.parseInt(scanner.nextLine());

        System.out.println("El acumulado es: " + (Math.pow(x,2) / 2 + 0.5 * x));

//---------------------------------------------------------------------------------------------------
        // metodo en el curso
        int acumulador = 0;
        var numero = 1;
        while(numero <= x){
            // mostrar lo que se va a sumar
            System.out.println("acumulador + numero -> " + acumulador + "+" + numero);
            //realizar la suma
            acumulador += numero++;

            //imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumulador);
        }

        System.out.println("Suma de los primeros " + x + " numeros= " + acumulador);

    }
}


