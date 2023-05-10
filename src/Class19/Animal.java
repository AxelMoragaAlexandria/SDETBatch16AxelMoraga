package Class19;

public class Animal {
   private String name;
    private String color;
    private double weight;
    private int age;
    private String breed;

    public void printInfo(){
        System.out.println(name+" "+color+" "+weight+" "+age+" "+breed);
    }

    public Animal(String name, String color, double weight, int age, String breed) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
        this.breed = breed;
    }
}

class Dog extends Animal {

    double price; //assigning the price
    public Dog(String name, String color, double weight, int age, String breed,double price){
        super(name, color, weight, age, breed);
                this.price=price;

    }
    public void printInfo(){
        super.printInfo(); //reusing the printInfo method from the parent class by using super keyword
        System.out.println(price);
    }


}
class Cat extends Animal{
    public Cat(String name, String color, double weight, int age, String breed){
        super(name, color, weight, age, breed);
    }
}

class Horse extends Animal{
    public Horse(String name, String color, double weight, int age, String breed){
        super(name, color, weight, age, breed);
    }

    }

class Main {
    public static void main(String[] args) {
        Dog dog1=new Dog("Tanji","Orange",5.5,5,"Poodle",900.50);
        dog1.printInfo();
        Cat cat1=new Cat("Didi","White",10.5,3,"Persian ");
        cat1.printInfo();
        Horse horse1=new Horse("Dexter","Black",50,20,"Mustang");
        horse1.printInfo();

    }
}
