package retos;

import java.util.Scanner;

public class PromedioCalificaciones {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas calificaciones desea agregar?");
        var cantCalificacion = Integer.parseInt(scanner.nextLine());
        var calificacionTotal = 0.0;
        var promedio = 0.0;

        double[] calificaciones = new double[cantCalificacion];

        for (int i = 0; i < cantCalificacion; i++){
            System.out.println("Ingrese la calificacion #" + (i + 1));
            calificaciones[i] = Double.parseDouble(scanner.nextLine());
            calificacionTotal += calificaciones[i];
        }

        promedio = calificacionTotal/cantCalificacion;
        System.out.println("promedio = " + promedio);
    }
}
