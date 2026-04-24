package cadenas;

public class MasConcatenacionCadenas   {
    static void main() {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        //metodo concat
        cadena3 = cadena1.concat(cadena2);
        System.out.println("cadena3 usando concat = " + cadena3);

        //metodo string builder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);

        //metodo String buffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1)
                .append(" ")
                .append(cadena2);

        resultado = stringBuffer.toString();
        System.out.println("resultado String Buffer = " + resultado);
        //usando join
        resultado = String.join(" ", cadena1, cadena2, "!");
        System.out.println("resultado join = " + resultado);
    }
}
