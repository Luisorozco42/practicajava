package cadenas;
//A recordar lo de los indices de las cadenas y como se maneja esto
public class IndicesCadena {
    static void main() {
        var cadena1 = "Hola Mundo";
        //recuperar el primer caracter de la cadena
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        var caracterM = cadena1.charAt(5);
        System.out.println("caracterM = " + caracterM);
    }
}
