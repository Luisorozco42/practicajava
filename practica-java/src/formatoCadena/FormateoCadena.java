package formatoCadena;

public class FormateoCadena {
    static void main() {
        System.out.println("*** Formateo Cadenas ***");

        var nombre ="Matias";
        var edad = 35;
        var salario = 21000.50;

        //String.format
        var mensaje = String.format("Nombre: %s Edad: %d Salario:  %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //otra forma
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);

    }
}
