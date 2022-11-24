package Exercise22;

public class ElectricCar extends Car{
    String typeofBatery="";
    public ElectricCar(int numDoors, int numWheels, int numPassengers,String typeofBatery, int speedLimit,int acelerationPercent) {
        super(numDoors, numWheels, numPassengers,speedLimit,acelerationPercent);
        this.typeofBatery = typeofBatery;
    }

    @Override
    void accelerate(int time) {
        currentSpeed=currentSpeed+(this.acelerationPercent*3*time);
    }

    @Override
    float consume(int velocity) {
        return velocity *(consumePercent);
    }
}
