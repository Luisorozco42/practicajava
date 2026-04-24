package cadenas;

public class ManejoSubcadenas {
    static void main() {
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        var subcadena1 = cadena1.substring(0,4); //esto se realiza asi porque el indice final no se incluye
        System.out.println("subcadena1 = " + subcadena1);
        var subcadena2 = cadena1.substring(5,10);// mismo caso que antes
        System.out.println("subcadena2 = " + subcadena2);
    }
}
