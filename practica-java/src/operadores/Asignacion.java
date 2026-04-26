package operadores;

public class Asignacion {
    static void main() {
        System.out.println("*** Operadores de Asignacion ***");
        //Asignacion simple
        var num = 10;
        int num2;
        num2 = 15;
        // ahora de asignacion compuestos
        //+=
        num  += 5;
        System.out.println("num = " + num);
        //-=, *=, /=
        num *= 2;
        System.out.println("num = " + num);
        //Asignacion de variables multiples
        int a = 10, b = 15, c = 20;// no se puede usar var ya que solo funciona para una variable
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
