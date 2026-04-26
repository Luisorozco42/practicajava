package operadores;

public class Logicos {
    static void main() {
        System.out.println("*** Operadores Logicos ***");
        boolean a = true, b = false;
        //Recordemos que && (and) solo devuelve verdadero cuando ambos sean verdadero
        // || (or) solo es falso si ambos valores son falsos
        // ! (not) niega el valor anterior, si era false se vuelve true y si era true se vuelve false

        var resultado = a && b;
        System.out.println("resultado a and b = " + resultado);
        resultado = a || b;
        System.out.println("resultado a or b = " + resultado);
        resultado = !a;
        System.out.println("resultado not a = " + resultado);
    }
}
