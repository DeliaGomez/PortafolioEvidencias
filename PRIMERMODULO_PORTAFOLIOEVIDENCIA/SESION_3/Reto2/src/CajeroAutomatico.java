//Importar la clase Scanner para poder leer la entrada del suario
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Crear objeto Scanner

        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();
        var saldo = 1000.0; //saldo inciial
        int opcion; //variable para almacenar la opcion del menu


        //Repetir el menú mientras la opcion no sea salie  (4)
        do {
            //Mostrar el menú de opciones
            System.out.println("\n ¡Bienvenido al cajero automático " + nombre + "!");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar efectivo");
            System.out.println("3. Retirar efectivo");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción: ");


            opcion = scanner.nextInt(); //Lee la opción elegida por el usuario
            // Estructura para manejar las opciones del menú

            switch (opcion) {
                case 1 -> {
                    //Consultar saldo
                    System.out.println(" Tu saldo actual es: $" + saldo);
                }
                case 2 -> {
                    //Depositar efectivo
                    System.out.println(" Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        //Validación: el monto debe ser mayor a 0
                        System.out.println("El monto debe ser mayor a $0");
                        continue; //volver al menú sin modificar el saldo
                    }

                    saldo += deposito; //Aumentar el saldo con el deposito
                    System.out.println("Depósito realizado. Saldo actualizado: $" + saldo);
                }

                case 3-> {
                    //Retirar dinero
                    System.out.println("Ingresa la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro<=0){
                        //Validación: el monto debe ser mayor a 0
                        System.out.println("El monto debe ser mayor a $0.");
                        continue; //Volver al menú sin hacer nada
                    }

                    if (retiro> saldo){
                        System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro; //Restar el monto del saldo
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);;
                    }
                }

                case 4 -> {
                    //Salir dle programa
                    System.out.println("Gracias por usar el cajero. ¡Hasta Pronto " + nombre + "!");
                }
                default -> {
                    //Opción no válida
                    System.out.println("Opción Inválida. Intenta nuevamente.");
                }

            }
        } while (opcion != 4); //SALIR CUANDO EL USUARIO ELIJA LA OPCIÓN 4

        scanner.close(); //Cerrar el scanner

    }
}
