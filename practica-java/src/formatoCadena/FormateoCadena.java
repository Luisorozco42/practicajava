package formatoCadena;

public class FormateoCadena {
    static void main() {
        System.out.println("*** Formateo Cadenas ***");

        var nombre ="Matias";
        var edad = 35;
        var salario = 21000.50;

        //String.format
        var mensaje = String.format("Nombre: %s Edad: %d Salario:  $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //otra forma
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;
        //formateo text block el \s es un espacio en blanco
        mensaje = """
                %nDetalle Persona:\s 
                ---------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        //formateo con text block y printf
        System.out.printf("""
                %nDetalle Persona:\s 
                ---------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """, nombre, numeroEmpleado, edad, salario);

    }
}
