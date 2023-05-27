package Class25;

import Class16.Dog;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        /*
        ArrayList=> a class (It's part of the collection's framework)
        <> These are called angle brackets or diamond operators
        we write the name of the class who's object we are planning to store
        in an arrayList
         */

        //creating an object of the car class, storing it in a variable car1
        Car car1=new Car("Toyota","BZ4");
        Car car2=new Car("Honda","Civic");
        Car car3=new Car("BMW","I7");
        ArrayList<Car>arrayList=new ArrayList<>();

        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);

        for(Car c:arrayList){
            c.printInfo();
        }






    }
}
class Car{
    String make;
    String model;

    Car(String make,String model){
        this.make=make;
        this.model=model;
    }

    void printInfo(){
        System.out.println(make+" "+model);
    }

}
