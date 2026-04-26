package consola;

import java.util.Scanner;

public class LeerTiposDatos {
    static void main() {
        //Leer distintos tipos de datos
        //leer tipo int
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu edad:\t");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        //Leer un double
        System.out.print("Ingresa tu altura:\t");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        //esto se realiza para consumir el salto de linea que los metodos anteriores no reconocen
        consola.nextLine();
        //Leer tipo String
        System.out.print("Ingresa tu nombre:\t");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //para evitar los detalles pasados se usan los conversores de datos
        System.out.print("Ingresa otro entero:\t");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        //tipo flotante
        System.out.println("Ingresa un flotante:\t");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        //Double.parseDouble();
        //Boolean.parseBoolean();
    }
}
