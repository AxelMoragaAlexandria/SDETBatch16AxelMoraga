package Class20;

public class Animal {
/*
Below we have fields/properties/attributes/ instance variables
 */
    /*
    This keyword to differienate between local variables and paramter variables
     */
   private String name;
  private  String breed;
  private  int age;
   private double weight;

     void eating() {
        System.out.println(name + " is eating");
    }

     void sleep() {
        System.out.println(name + " is sleeping");
    }

     void running() {
        System.out.println(name + " is running");
    }

    Animal(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
}
    class Dog extends Animal{
        Dog(String name,String breed,int age,double weight){
            super(name, breed, age, weight);
        }

@Override
          void sleep(){
            System.out.println("I like to sleep for 10.6 hours a day");

        }


    }



class Cat extends Animal{
    Cat(String name,String breed,int age,double weight){
        super(name, breed, age, weight);


    }



}

class Horse extends Animal {
    Horse(String name, String breed, int age, double weight) {
        super(name, breed, age, weight);
    }

}




