package sentencias;

import java.util.Scanner;

public class CasaEspejos {
    static void main() {
        System.out.println("*** Bienvenido a la casa de los espejos ***");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu edad?");
        var edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Tienes miedo a la oscuridad? (true/false)");
        var tieneMiedoOscuridad = Boolean.parseBoolean(scanner.nextLine());

        if(!tieneMiedoOscuridad && edad >= 10) System.out.println("Puedes entrar a la cas de los espejos");
        else System.out.println("Lo siento, la casa de los espejos podria darte miedo");
    }
}
