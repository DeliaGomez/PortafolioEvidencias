public class Producto {
    //Atributos de producto
    String nombre;
    double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Método que muestra la indormación del producto en consola
    public void mostrarInformacion(){
        System.out.println("Producto: " + nombre + " - Precio: $" + precio);
        System.out.println("Producto: " + nombre + " - Precio: $" +  String.format("%, .2f", precio));
    }
}
