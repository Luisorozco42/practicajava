package ciclos;

public class NumerosPares {
    static void main() {
        //este es una forma
        int i = 0;
        while (i <= 20){
            if (i % 2 == 0) System.out.println(i++);
            else i++;
        }

        int j = 0;
        while (j <= 10){
            System.out.println(2*j);
            j++;
        }
    }
}
