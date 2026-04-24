public class ReservaHotal {
    static void main() {
        var nombreCliente = "Luis Orozco";
        var diasEstancia = 4;
        var tarifaDiaria = 50.5F;
        var tieneVistaMar = true;

        System.out.println("Nombre del cliente: " + nombreCliente + "\n" +
                "Días de estancia: " + diasEstancia + "\n" +
                "Tarifa diaria: " + tarifaDiaria + "\n" +
                "Tiene vista al mar: " + tieneVistaMar + "\n");

        nombreCliente = "Juan Mecanico";
        diasEstancia = 5;
        tieneVistaMar = false;

        System.out.println("Nombre del cliente: " + nombreCliente + "\n" +
                "Días de estancia: " + diasEstancia + "\n" +
                "Tarifa diaria: " + tarifaDiaria + "\n" +
                "Tiene vista al mar: " + tieneVistaMar);
    }
}
