package retos;

import java.util.Scanner;

public class CalculoAreaPerimetro {
    static void main() {
        //calcular el area y perimetro de un rectangulo
        //area es = base * altura
        //perimetro = 2 * (base + altura)
        System.out.println("*** Sistema de calculo de are y perimetro de un rectrangulo ***");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la medida de la base del rectangulo:\t");
        var base = Double.parseDouble(scanner.nextLine());
        System.out.print    ("Ingrese la medida de la altura del rectangulo:\t");
        var altura = Double.parseDouble(scanner.nextLine());

        var area = base * altura;
        var perimetro = 2 * (base + altura);

        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);

    }
}
