package sentencias;

public class Decision  {
    static void main() {
        //uso de if aunque tambien enseñan como funciona el debug
        var edad = 30;

        if(edad >= 18) System.out.println("Eres mayor de edad");
        else if(edad >=13 && edad < 18) System.out.println("Eres un adolecente");
        else System.out.println("Eres un niño");
    }
}
