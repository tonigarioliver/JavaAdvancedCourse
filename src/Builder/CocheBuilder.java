package Builder;

public class CocheBuilder {
    Vehiculo vehicle;
    public CocheBuilder(String marca){
        vehicle = new Vehiculo();
        vehicle.setBrand(marca);
    }

    public CocheBuilder setNumpuertas(int numpuertas){
        vehicle.setNumpuertas(numpuertas);
        return this;
    }

    public CocheBuilder setMotor(String motor){
        vehicle.setMotor(motor);
        return this;
    }

    public Vehiculo build() {
        return this.vehicle;
    }
}
