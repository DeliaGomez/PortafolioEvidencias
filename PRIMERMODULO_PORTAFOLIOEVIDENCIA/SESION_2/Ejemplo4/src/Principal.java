public class Principal {
    public static void main(String[] args) {
        //Crear un objeto de tipo producto usndo el record
        Producto producto = new Producto("Monitor", 3299.99);

        //Muestra le tString() generado automáticamente por el record.
        System.out.println(producto);
    }
}
