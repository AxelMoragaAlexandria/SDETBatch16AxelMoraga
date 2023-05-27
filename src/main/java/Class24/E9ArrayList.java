package Class24;

import java.util.ArrayList;

public class E9ArrayList {
    public static void main(String[] args) {
        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways

         */

        ArrayList<String> cars=new ArrayList<>();
                cars.add("BMW");
                 cars.add("Honda");
                cars.add("Toyota");


        System.out.println(cars);

        for(String car:cars){
            System.out.println(car);
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }









    }
}

