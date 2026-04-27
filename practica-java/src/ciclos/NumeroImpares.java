package ciclos;

public class NumeroImpares {
    static void main() {
        int i = 0;

        do {
            if (i % 2 != 0) System.out.println(i);
            i++;
        }while (i <= 20);
    }
}
