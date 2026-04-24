package cadenas;

public class MetodosCadenas {
    static void main() {
        var cadena1 = "Hola Mundo";
        //largo de una cadena
        var largoCadena = cadena1.length();
        System.out.println("largoCadena = " + largoCadena);
        //reemplazar caracteres
        var nuevaCadena = cadena1.replace('o','a');//remplaza todas las o
        System.out.println("nuevaCadena = " + nuevaCadena);
        //convertir a mayusculas
        var mayuscula = cadena1.toUpperCase();
        System.out.println("mayuscula = " + mayuscula);
        //convertir a minusculas
        System.out.println("minusculas: " + cadena1.toLowerCase());
        //eliminar espacios al inicio y al final
        var cadena2 = " Luis Guillermo   ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 sin espacios: " + cadena2.trim());
    }
}
