package Exercise22;

public class HibridCar extends Car{
    String typeofCharge="";
    public HibridCar(int numDoors, int numWheels, int numPassengers,String typeofCharge, int speedLimit,int acelerationPercent) {
        super(numDoors, numWheels, numPassengers,speedLimit,acelerationPercent);
        this.typeofCharge=typeofCharge;
    }

    @Override
    void accelerate(int time) {
        currentSpeed=currentSpeed+(acelerationPercent*2*time);
    }

    @Override
    float consume(int velocity) {
        return velocity*((consumePercent/100)^2);
    }
}
