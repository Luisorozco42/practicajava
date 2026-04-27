package operadores;

public class Ternario {
    static void main() {
        System.out.println("Operadores Ternarios");
        //sintaxis
        //condicion ? exp1 : exp2
        //determinar si un numero es par
        var num = 4;
        var resultado = (num % 2 == 0) ? "Par" : "Impar";

        System.out.println("El numero " + num + " es" + resultado);

        //calcular si es mayor de edad
        var edad = 17;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println(mensaje);
        //valor positivo, negativo o 0
        num = 10;
        resultado = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "0";
        System.out.println("El numero " + num + " es " + resultado);
    }
}
