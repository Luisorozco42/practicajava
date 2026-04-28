package arreglos;

import java.util.Scanner;

public class MatrizDinamica {
    static void main() {
        int filas, columnas;
        Scanner scanner = new Scanner(System.in);

        //definir la matriz
        System.out.print("Proporciona las filas de la matriz:\t");
        filas = Integer.parseInt(scanner.nextLine());
        System.out.print("Proporciona la cantidad de columnas:\t");
        columnas = Integer.parseInt(scanner.nextLine());

        var matriz = new int[filas][columnas];

        for(int i = 0; i< filas ;i++){
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor de la matriz [" + i + "][" + j + "] = ");
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for(int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++) {
                System.out.println("valor matriz [" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

    }
}
