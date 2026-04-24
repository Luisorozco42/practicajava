package cadenas;

public class ReemplazarSubcadenas {
    static void main() {
        //Tecnicamente se muetra tambien que las cadenas son inmutables
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        //vamos a reemplazar Mundo por Todos
        var cadena2 = cadena1.replace("Mundo", "a todos");
        System.out.println("cadena2 = " + cadena2);
        cadena2 = cadena1.replace("Hola", "Adios");
        System.out.println("cadena2 = " + cadena2);
    }
}
