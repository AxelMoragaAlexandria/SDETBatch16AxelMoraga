package Class22;

public abstract class Animal {
    /*
    Create 3 animals Dog Cat and Horse
    Define 3 common methods in each class like speak,eat, and sleep
    create the object of all the classes and call the methods
     */

   private String name;
    private String color;
  final private String breed;

    Animal(String name,String color,String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }

    abstract public void speak();
  abstract public void eat();
    abstract public void sleep();

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
}
class Dog extends Animal{

    Dog(String name,String color,String breed){
        super(name, color, breed);
    }


    @Override
    public void speak() {
        System.out.println("woof woof");
    }
    @Override
    public void eat (){
        System.out.println("Chomp Chomp");
    }
    @Override
    public void sleep () {
        System.out.println("rawrrrrr");
    }

}

class Cat extends Animal{

    Cat(String name,String color,String breed){
        super(name, color, breed);
    }

    @Override
    public void speak() {
        System.out.println("meow meow");
    }
    @Override
    public void eat (){
        System.out.println("Cat food");
    }
    @Override
    public void sleep () {
        System.out.println("shhhhhh");
    }



}

class Horse extends Animal{
    Horse(String name,String color,String breed) {
        super(name, color, breed);
    }
    @Override
    public void speak() {
        System.out.println("Mehhhhhhh");
    }
    @Override
    public void eat (){
        System.out.println("Grass");
    }
    @Override
    public void sleep () {
        System.out.println("......mmm.....");
    }


}


