package operadores;

public class Unarios {
    static void main() {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;
        //operador unario +
        resultado = +a;
        System.out.println("a = " + resultado);
        // operador unario -
        resultado = -a;
        System.out.println("a = " + resultado);
        //operadores unarios de incremento y decremento
        //pre-incremento
        resultado = ++a;
        System.out.println("resultdo pre-incremento = " + resultado);
        System.out.println("a = " + a);
        a = 3;
        //post-incremento
        resultado = a++;
        System.out.println("resultado post-incremento = " + resultado);
        System.out.println("a = " + a);
        //Pre-decremento
        resultado = --b;
        System.out.println("resultado pre-decremento = " + resultado);
        System.out.println("b = " + b);
        //post-decremento
        b = -2;
        resultado = b--;
        System.out.println("resultado post-decremento = " + resultado);
        System.out.println("b = " + b);


    }
}
