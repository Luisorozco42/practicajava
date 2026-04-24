public class Variables {
    static void main() {
        //Toca ver como se crean variables de nuevo
        //Cabee a destacar que cuando proponen los ejercicios yo realizo estos a como yo quiero
        //En otras palabras a veces se mirara codigo mas avanzados
        int edad = 31;
        double precio = 300.40;
        boolean disponible = true;
        String disponibleText = (disponible) ? "Si" : "No"; // Estos es un lambda de condicion
        char genero;

        genero = 'M'; // M-Masculino F-Femenino

        //Acceder a las variables

        System.out.println(edad);
        //Modificar las variables
        edad = 35;
        System.out.println(edad);
        //Ejercicio de mandar a imprimir las variables

        System.out.println("Edad: " + edad + "\n" +
                "Precio: " + precio + "\n" +
                "Está disponible: " + disponibleText + "\n" +
                "Género: " + genero);
    }
}
