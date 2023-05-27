package Class22;

public class AnimalTester {

        public static void main(String[] args) {


            Animal[] animals = {new Dog("Jacky","Black","Unknown"),
                    new Cat("Tom","Blue","Persian"),
                    new Horse("Shaggy","Brown","Belverian")};

            for (Animal animal : animals) {
                animal.eat();
                animal.sleep();
                animal.speak();
                animal.printInfo();
            }

        }
    }

