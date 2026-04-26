package retos;

import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        var numeroAleatorio = random.nextInt(9999) + 1;
        System.out.print("Ingrese su nombre:\t");
        var nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido:\t");
        var apellido = scanner.nextLine();
        System.out.print("Ingrese su año de nacimiento:\t");
        var anioNacimiento = scanner.nextLine();
        var identificador = nombre.substring(0,2).toUpperCase() +
                apellido.substring(0,2).toUpperCase() +
                anioNacimiento.substring(2,4) +
                "%04d".formatted(numeroAleatorio);

        System.out.printf("""
                \n
                Datos obtenidos para el Id Unico:\s
                \tNombre: %s
                \tApellido: %s
                \tAño: %s
                \tNumero aleatorio: %04d
                \tId Unico: %s
                """, nombre, apellido, anioNacimiento, numeroAleatorio, identificador);

    }
}
