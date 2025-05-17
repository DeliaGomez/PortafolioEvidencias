public class Entrada {
    //Artributos
    String nomEvento;
    int precio;

    // Constructor ya incluye parametros
    public Entrada(String evento, int precio){
        this.nomEvento = evento;
        this.precio = precio;
    }

    //Método para mostrar información
    public void mostrarInformacion(){
        System.out.println("Evento: " + nomEvento + " | Precio: $" + precio);
    }
}
