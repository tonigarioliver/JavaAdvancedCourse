package Builder;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new CocheBuilder("Volkswagen")
                .setMotor("Gasolina").build();
    }
}

