package arreglos;

public class MatrizSimplificada {
    static void main() {
        int[][] matriz = new int[][]{{100, 200, 300}, {400, 500, 600}};

        System.out.println("Leer valores");
        for(int i = 0; i< 2 ;i++){
            for (int j = 0; j < 3; j++) {
                System.out.println("valor matriz [" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }
}
