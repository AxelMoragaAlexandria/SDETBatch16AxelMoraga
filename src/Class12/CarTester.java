package Class12;

public class CarTester {
    public static void main(String[] args) {

        //below code will create an object of car class


        Car car= new Car();
        car.make="Toyota";
        car.model="Camry";
        car.color="White";
        car.mileage=0;
        car.isAutomatic=true;
        car.starCar();
        car.turn();
        car.stopCar();

        Car car1=new Car();

        car1.make="Tesla";
        car1.model="s";
        car1.mileage=15000;
        car.isAutomatic=true;
        car1.starCar();
        car1.turn();
        car1.stopCar();














    }
}