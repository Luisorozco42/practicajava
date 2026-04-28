package arreglos;

public class DeclaracionValor {
    static void main() {
        var enteros = new int[5];
        //modificar los elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[2] = 62;
        enteros[3] = 45;
        enteros[4] = 76;

        //leer valores de un arreglo
        System.out.println("Valor 1: "+ enteros[0]);
        System.out.println("Valor 2: "+ enteros[1]);
        System.out.println("Valor 3: "+ enteros[2]);
        System.out.println("Valor 4: "+ enteros[3]);
        System.out.println("Valor 5: "+ enteros[4]);

    }
}
