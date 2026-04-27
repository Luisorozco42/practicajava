package ciclos;

public class BreakContinue {
    // funcionan para controlar el flujo de los ciclos

    //break termina el loop
    //continue no lo termina, pero si la iteracion
    static void main() {
        System.out.println("*** Break y Continue ***");

        System.out.println("\nPalabra Break");
        for (var numero = 1; numero < 10; numero++){
            if(numero % 2 == 0) {
                System.out.println(numero + " ");
                break;
            }
        }
        //ejemplo con continue
        System.out.println("\nPalabra continue");
        for(var numero = 1; numero < 10; numero++){
            if(numero % 2 == 1){
                continue;
            }
            System.out.println(numero);
        }
    }
}
