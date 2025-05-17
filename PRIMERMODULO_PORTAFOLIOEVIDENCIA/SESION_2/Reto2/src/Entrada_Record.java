public record Entrada_Record (String nombEvento, double precio) {
    public void mostrarInfomracion(){
        System.out.println("Evento: " + nombEvento + " | Precio: $" + precio);
    }
}
