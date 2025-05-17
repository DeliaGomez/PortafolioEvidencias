public class Vuelo {
    final String codigoVuelo; //constamte
    String destino;
    String horaSalida;
    Pasajero asientoReservado; //Se asignará una instancia o null


    public Vuelo(String codigoVuelo, String destino, String horaSalida){
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this. horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    //Método con parámetrto y valor de retorno
    public  boolean reservarAsiento(Pasajero p){
        if (asientoReservado == null){
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    //Método con sobrecarha permita reservar con una cadena simples
    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return  reservarAsiento(nuevoPasajero);
    }

    // Método sin retorno
    public void cancelarReserva(){
        asientoReservado = null;
    }

    //Método que retorna un String
    public String obtenerItinerario(){
        String info = "Itinerario de vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado !=null){
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;

    }



}
