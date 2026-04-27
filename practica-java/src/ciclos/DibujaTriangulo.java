package ciclos;

import java.util.Scanner;

public class DibujaTriangulo {
    static void main() {
        System.out.println("*** Dibuja un rectangulo ***");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de filas que quieras en tu triangulo: \n");
        var numeroFilas = Integer.parseInt(scanner.nextLine());
        //iteramos sobre cada fila del tringulo
        for(int i = 1; i <= numeroFilas; i++){
            var espacioBlanco = " ".repeat(numeroFilas - i);
            var asterisco = "*".repeat(2 * i - 1);
            System.out.println(espacioBlanco + asterisco);
        }
    }
}
