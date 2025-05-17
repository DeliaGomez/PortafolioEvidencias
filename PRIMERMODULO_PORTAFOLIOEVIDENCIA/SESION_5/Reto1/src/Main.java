public class Main {
    public static void main(String[] args) {

        //Creamos dos facturas con el mismo folio
        Factura f1 = new Factura("FAC001", "Juan Pérez", 1450.00);
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.00);

        //Mostramos ambas fascturas con toString
        System.out.println(f1);
        System.out.println(f2);

        //Comparamos si son igualres usanod eqals()
        System.out.println("¿Las facturas son las mismas!: " + f1.equals(f2));
    }

}
