package Exercise22;

abstract class Car {
    private int numDoors;
    private int numWheels;
    private int numPassengers;
    protected int consumePercent;
    protected int speedLimit;
    protected float currentSpeed;
    protected final float acelerationPercent;
    public Car(int numDoors, int numWheels, int numPassengers,int speedLimit,float acelerationPercent){
        this.numDoors=numDoors;
        this.numWheels=numWheels;
        this.numPassengers=numPassengers;
        this.acelerationPercent = acelerationPercent;
    }
    abstract void accelerate(int time);

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    abstract float consume(int velocity);

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}
