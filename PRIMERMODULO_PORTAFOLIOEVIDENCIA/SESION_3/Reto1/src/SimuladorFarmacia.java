import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String medicamento;
        double precio;
        int piezas;

        System.out.println("Por favor ingresa el nombre del medicamento: ");
        medicamento = scanner.nextLine();

        System.out.println("Por favor ingresa el precio del medicamento: ");
        precio = scanner.nextDouble();

        System.out.println("Digita el número de piezas: ");
        piezas = scanner.nextInt();

        // Cuenta total a pagar sin descuento
        double totalsd =  (piezas * precio);

        // Aplica descuento???
        var apds = totalsd > 500;
        double descto = apds ? totalsd * 0.15 : 0;

        // Cuenta total con descuento
        double cttl = totalsd - descto;

        System.out.println("\n \uD83D\uDCDD Resumen del pedido:\n");

        System.out.println("Medicamento: " + medicamento);
        System.out.println("Total de piezas a comprar:" + piezas);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + totalsd);
        System.out.println("¿Aplica descuento?: " + apds);
        System.out.println("Descuento: $" + descto);
        System.out.println("Total a pagar: $" + cttl);

    }
}
