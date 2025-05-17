//Clase que representa una factura pra un sistema contable
public class Factura {

    //Atributos de la factura
    private  String folio;
    private String cliente;
    private double total;

    //Constructor
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    //Método toString() para reoresenta el objeto de forma legiblw
    @Override
    public String toString(){
        return "Factura [Folio=" + folio + ", Cliente=" + cliente + ", Total= $" + "]";
    }

    //Método equals() para comaprar si dos facturas tienen el mismo folio
    @Override
    public  boolean equals(Object obj){
        if (this == obj) return true; //Mismo objeto en memoria
        if (obj == null || getClass() !=obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return  this.folio.equals(otra.folio); //Comparamos solo el folio
    }

    //Método hashcode() cosnsitente con equals(). basado ern el folio
    @Override
    public  int hashcode(){return  folio.hashCode();
    }
}
