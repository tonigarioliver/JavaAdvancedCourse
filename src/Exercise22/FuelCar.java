package Exercise22;

public class FuelCar extends Car{
    String typeofFuel="";
    public FuelCar(int numDoors, int numWheels, int numPassengers,String typeofFuel, int speedLimit,int acelerationPercent) {
        super(numDoors, numWheels, numPassengers,speedLimit,acelerationPercent);
        this.typeofFuel=typeofFuel;
    }

    @Override
    void accelerate(int time) {
        currentSpeed=currentSpeed+(acelerationPercent*time);
    }

    @Override
    float consume(int velocity) {
        return velocity*((consumePercent/100)^3);
    }
}
