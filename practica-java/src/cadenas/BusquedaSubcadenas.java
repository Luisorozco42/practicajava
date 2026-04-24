package cadenas;

public class BusquedaSubcadenas {
    static void main() {
        var cadena1 = "Hola Mundo";
        var indice1 = cadena1.indexOf("Hola"); //esto devuelve el indice de donde inicia el la subcadena
        System.out.println("indice1 = " + indice1);
        var indice2 = cadena1.lastIndexOf("Mundo");//este es el ultimo indice
        System.out.println("indice2 = " + indice2);
        var indice3 = cadena1.indexOf("Java"); //cuando no se encuentra deja un -1
        System.out.println("indice2 = " + indice3);

    }
}

