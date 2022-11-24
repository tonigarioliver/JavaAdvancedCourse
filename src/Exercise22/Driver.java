package Exercise22;

public class Driver {
    private Car car;
    private int yearsOfExperience;

    public Driver(Car car,int yearsOfExperience){
        this.car=car;
        this.yearsOfExperience=yearsOfExperience;
    }

    float pressAcelerator(int time){
        car.accelerate(time);
        return car.getCurrentSpeed();
    }
}
