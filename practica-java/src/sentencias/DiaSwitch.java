package sentencias;

import java.util.Scanner;

public class DiaSwitch {
    static void main() {
        //version clasica
        //dia de la semana usando switch
        System.out.println("*** Dia de la semana con sentencia switch");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero del dia:\t");
        var dia = Integer.parseInt(scanner.nextLine());

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido" + dia);
                break;
        }

        //version mejoradas
        String nombreDia = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "El dia es invalido " + dia;
        };

        System.out.println("El dia es = " + nombreDia);
    }
}
