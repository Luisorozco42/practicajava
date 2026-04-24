package retos;

public class GeneradorEmail {
    static void main() {
        var nombre = "Ubaldo Acosta Soto";
        var nombreTransformado = nombre.toLowerCase().replace(" ", ".");
        var empresa = "Global Mentoring";
        var empresaTransformado = empresa.toLowerCase().replace(" ", "");
        var dominio = "com.mx";

        var resultado = String.join("", nombreTransformado,"@",empresaTransformado,dominio);
        System.out.println("resultado = " + resultado);
    }
}
