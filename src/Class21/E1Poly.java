package Class21;

public class E1Poly {

    public static void main(String[] args) {

       /* Animal[]animals={new Dog("Kantoor","black","German"),
                new Cat("Pesho","Grey","Italian"),
                new Horse("Kal", "Black","Turkish")
        };


        for(Animal animal:animals){
            animal.speak();
            animal.eat();
            animal.sleep();
        }

        */

        Animal dogStoreInAnimal=new Dog("Kantoor","black","German");
//We must type cast the variable back to a dog to call the run method
// as this run method only exist in the Dog class
        Dog d=(Dog)dogStoreInAnimal;
        d.run();



       // int num=(int)10.0;

    }
}
