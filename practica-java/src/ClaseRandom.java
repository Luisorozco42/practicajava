import java.util.Random;

public class ClaseRandom {
    static void main() {
        System.out.println("*** Numeros aleatorios ***");
        Random random = new Random();

        //generar variable random
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        //generar un valor entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);
        //generar un numero flotante entre 0.0 y 1.0 sin poner datos da ese intervalo por defecto
        var numeroFlotante = random.nextFloat();
        System.out.println("numeroFlotante = " + numeroFlotante);

        //simular el lanzamiento de un dado de 6 caras
        var dado = random.nextInt(6) + 1;
        System.out.println("dado = " + dado);
    }
}
