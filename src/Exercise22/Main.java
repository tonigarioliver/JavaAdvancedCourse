package Exercise22;

public class Main {
    public static void main(String[] args){
        Car car1 = new ElectricCar(4,4,4,"Litti",300,10);
        Car car2 = new HibridCar(4,4,4,"FAST",300,10);
        Car car3 = new FuelCar(4,4,4,"Diesel",300,10);
        System.out.println("RACE STARTS!!");
        Driver driver1 = new Driver(car1,20);
        System.out.println("Driver one velocity: "+driver1.pressAcelerator(10));

        Driver driver2 = new Driver(car2,20);
        System.out.println("Driver one velocity: "+driver2.pressAcelerator(10));

        Driver driver3 = new Driver(car3,20);
        System.out.println("Driver one velocity: "+driver3.pressAcelerator(10));
    }
}
