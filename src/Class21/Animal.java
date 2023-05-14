package class21;
public class Animal {

    String name;
    String color;
    String breed;

    Animal(String name,String color,String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }

    void speak(){
        System.out.println("Animal speak");
    }
    void sleep(){
        System.out.println("Animals sleep");
    }
    void eat(){
        System.out.println("Animals eat many different things");
    }

}

class Cat extends Animal {
    Cat(String name,String color,String breed){
        super(name, color, breed);
    }
    @Override
        void speak(){
        System.out.println("Meow meow.....");
        }
        @Override
    void eat(){
            System.out.println("Cats likes to eat Fish");
        }
        @Override
    void sleep(){
            System.out.println("Cats likes to sleep 15 hours");
        }
}
 class Dog extends Animal{
    Dog(String name,String color,String breed){
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woof woof");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 8 hours");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew the bones");
        }
        void run(){
            System.out.println("Dog can run fast");
        }

}
class Horse extends Animal{
    Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("neigh neigh");
    }
    @Override
    void eat(){
        System.out.println("Horse like Carrots+ Grass");
    }
    @Override
    void sleep(){
        System.out.println("Horses sleep 2-3 hours");
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Shaggy","Black","German");
        dog.printInfo();
//Parent class variables can store the objects of the child classes
        Animal dog1=new Dog("Shaggy","Black","German");
            dog1.printInfo();

            Animal[]animals={new Dog("Shaggy","Black","German"),new Cat("Tom","Blue","Persian")};

            for(Animal ani:animals){
                ani.printInfo();
            }
                //type casting(widening)
                double d=10;
           Animal dog2=new Dog("Shaggy","Black","German");

           //type casting (narrowing)
       int g=(int)10.5;
     //Dog dog3=(Dog)new Animal("Shaggy","Black","German");

        //double j=5;
        int i=(int)10.90;
        System.out.println(i);

    }
}
