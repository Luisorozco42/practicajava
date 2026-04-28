package arreglos;

public class SintaxisSimplificada {
    static void main() {
        //primera forma
        //int[] enteros = {100, 200, 300, 400, 500};
        //segunda forma
        var enteros = new int[]{100, 200, 300, 400, 500};
        var contador = 1;

        for (int entero : enteros) {
            System.out.println("Valor " + contador++ + " = " + entero);
        }
    }
}
