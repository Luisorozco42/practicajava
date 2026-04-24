package variables;

public class TipoVar {
    static void main() {
        /*
        El tipo var es distinto a los otros tipos de variables, este no esta ligado a uno en especifico
        pero al definir el valor se liga al tipo de valor que se le asigno primeramente.
        Cabe a recalcar que se tiene que definir su valor en el momento que se crea la variable.

        Es como el var de kotlin (Dato a mi persona)
        */

        //Ejemplo en el curso
        //sin var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        //con var
        var nombre2 = "Carlos"; // ya que se definio de esta manera ya no acepta otros que no sean string
        //definir otras varianles con var
        var edad = 30;//int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; //float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; //boolean
        System.out.println("esCasado = " + esCasado);
    }
}
