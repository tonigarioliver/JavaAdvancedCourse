package Factory;

public class PrecioFactory {
    Precio precio;
    private PrecioFactory(){};
    public PrecioFactory(String pais){
        if(pais.equalsIgnoreCase("España")){
            System.out.println("Precio en España");
            this.precio = new PrecioEUR();
        }else{
            System.out.println("Precio fuera de España");
            this.precio = new PrecioUSD();
        }
    }
    public double getPrecio(){
        return precio.getPrecio();
    }
}
