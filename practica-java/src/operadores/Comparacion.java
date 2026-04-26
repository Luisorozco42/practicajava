package operadores;

public class Comparacion {
    static void main() {
        System.out.println("*** Operadores de Comparacion ***");
        int a = 3, b = 2;

        // == es igual?
        var resultado = a == b; // el warning es porque es logico que es distinto
        System.out.println("resultado a es igual a b = " + resultado);
        // != Es distinto?
        resultado = a != b;
        System.out.println("resultado a no es igual a b = " + resultado);
        //> es mayor que?
        resultado = a > b;
        System.out.println("resultado a es mayor que b = " + resultado);
        //< es menor que?
        resultado = a < b;
        System.out.println("resultado a es menor que b = " + resultado);
        //>= es mayor o igual que?
        resultado = a >= b;
        System.out.println("resultado a es mayor o igual que b = " + resultado);
        //<= Es menor o igual que?
        resultado = a <= b;
        System.out.println("resultado a es menor igual que b = " + resultado);

    }
}
