package Factory;

public class Main {
    public static void main(String[] args){
        PrecioFactory precioFactory = new PrecioFactory("España");
        System.out.println(precioFactory.getPrecio());
    }
}
