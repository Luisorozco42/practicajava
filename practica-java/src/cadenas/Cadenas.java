package cadenas;
//literal el manejo de cadenas
public class Cadenas {
    static void main() {
        System.out.println("*** Manejo de cadenas en Java ***");

        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo"); //asi lo enseñan, aunque también pienso que esta bien introducir el
        //el concepto de objetos
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        var cadena4 = """
                Este es un texto
                multilineas
                """; // cabe a destacar que los saltos no se respetan, se necesita el \n para que salgan
    }
}
