public class TiposDatos {
    static void main() {
        //Tipos de datos en java
        //Enteros (su valor por default es el 0)
        //byte tipoByte = (byte) 128; cabe a destacar que el tipo byte solo puede llegar hasta 127,
        // por eso se hace un parse, pero se pierde precision
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        // El tipo short puede almacenar hasta 16 bits, recordemos que 1 byte son 8 bits, por lo tanto,
        // 2 bytes son 16 bits, mismo caso que en byte, 32000 es el max, por lo tanto, si se quiere
        // algo más, es necesario usar (short) pero esto puede dejar perdidas
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        //Tipo entero hasta 32 bits, igual que antes este es su max valor que se puede almacenar
        int tipoEntero = 2147483647;
        //Tipo long puede almacenar hasta 64 bits, este es su valor max, pero si se quiere pasar este solo se
        // agrega una "l/L" al final del número
        long tipoLong = 987654321;
        System.out.println("tipoLong = " + tipoLong);

        //Tipo Flotante (su valor por default es el 0.0)
        //float, es necesario usar una "F" sea mayuscula o minuscula
        float tipoFlotante = 3.14F;
        System.out.println("tipoFlotante = " + tipoFlotante);
        //double, no es necesarrio poner la "d"
        double tipoDouble = 3.1315;
        System.out.println("tipoDouble = " + tipoDouble);

        //caracteres (su valor por default es '\u0000')
        //char, solo te permite poner un caracter de cualquier unicode que se desee
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //boolean (su valor por default es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //objetos o valor de referencia (su valor por default es null)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);
    }
}
