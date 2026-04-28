package arreglos;

public class Matriz {
    static void main() {
        //definimos una matriz 2x3
        int [][] matriz = new int[2][3];
        //modificar valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        System.out.println("Leer valores");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("valor matriz [" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

    }
}
