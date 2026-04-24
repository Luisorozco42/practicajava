package cadenas;

public class ComparacionCadenas {
    static void main() {
        var cadena1 = "Java"; //si no se usa el new, se meten en un pool de cadena
        var cadena2 = "Java";
        var cadena3 = new String("Java"); // se genera un nuevo espacio en memorio

        //comparacion de cadenas
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2); //Recordemos que se usan las referencias no la cadena en si
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);
        //para comparar contenidos existe .equals
        System.out.print("cadena1 es igual a la cadena3: ");
        System.out.println(cadena1.equals(cadena3));

    }
}
