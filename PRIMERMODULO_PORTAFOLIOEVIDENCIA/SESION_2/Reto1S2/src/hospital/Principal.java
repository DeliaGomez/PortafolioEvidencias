
package hospital;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Paciente p1 = new Paciente();

        System.out.print("Ingresa el nombre del paciente: ");
        p1.nombre = input.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        p1.edad = input.nextInt();
        input.nextLine();

        System.out.print("Ingresa el número de expediente del paciente: ");
        p1.numeroExpediente = input.nextLine();

        input.close();

        p1.mostrarInformacion();
    }
}
