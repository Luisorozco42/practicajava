package consola;

import java.util.Scanner;

public class SistemaEmpleado {
    static void main() {
        System.out.println("*** Sistema de empleados ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado:\t");
        var nombreEmpleado = consola.nextLine();
        System.out.print("Ingrese la edad del empleado:\t");
        var edadEmpleado = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el salario del empleado:\t");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());
        System.out.print("Es jefe de departamento:\t");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //imprimir
        System.out.println("\nDatos del empleado");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado);
        //System.out.println("\tSalario: " + salarioEmpleado); primera forma de poner un double
        System.out.printf("Salario: $%.2f%n", salarioEmpleado); //la f en printf es de formated
        System.out.println("\tEs Jefe de departamento: " + esJefeDepartamento);
    }
}
