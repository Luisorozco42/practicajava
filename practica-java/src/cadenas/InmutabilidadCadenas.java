package cadenas;
/*
    Se explica que los tipos String son inmutables, en otras palabras estos quedan
    almacenados en memoria pero no son reemplazados al cambiar el dato de la variable
*/
public class InmutabilidadCadenas {
    static void main() {
        var cadena1 = "Hola";// se genera un espacio en memoria y la variable apunta a ese espacio
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;// se guarda el lugar donde apunta cadena1 para no perder el dato
        cadena1 = "adios";// Se genera un nuevo espacio en memoria y la variable apunta a ese espacio nuevo
        System.out.println("cadena1 modificado = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
    }
}
