package variables;

public class Constantes {
    static void main() {
        /*Las constantes se declaran con la palabra reservada final, luego el tipo de variable
        Y por ultimo el nombre de la variable completamente en mayuscula y separado por guines bajos
        Cabe a destacar que se declara su valor en el momento y no se puede cambiar del todo
        */
        System.out.println("*** variables.Constantes en Java ***");
        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);
        final var PI = 3.1416;
        System.out.println("PI = " + PI);
        System.out.println("Math.PI: " + Math.PI);
        final var MENSAJE_BIENVENIDA = "Bienvenid@ a la universidad Java";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);
        final var MINUTOS_POR_SEGUNDO = 60;
        System.out.println("MINUTOS_POR_SEGUNDO = " + MINUTOS_POR_SEGUNDO);
    }
}
