public class Principal {
    public static void main(String[] args) {
        //Crear un pasajero
        Pasajero pasajero = new Pasajero( "Ana Martínez",  "P123456");

        //Crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "Paris", "14:38");

        //Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado){
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reservación.\n");
        }

        //Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        //Cancelar reservación
        System.out.println("Cancelando reservación...\n");
        vuelo.cancelarReserva();

        //Mostrar utuneraruo actualizado
        System.out.println(vuelo.obtenerItinerario());

        //Realizaxmos una nueva reservación
        vuelo.reservarAsiento("Mario González", "P987654");
        System.out.println(vuelo.obtenerItinerario());
    }
}
