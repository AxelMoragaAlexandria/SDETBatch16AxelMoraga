package Class17;

public class Cat {
String name;
    Cat(String catName){
        name=catName;
        System.out.println("1 argument constructor called");
    }
  /*  Not allowed as we already have a constructor that takes a String value
  Cat(String color)
   */
    Cat(String name, String color){
        System.out.println("2 argument constructor called");
    }

Cat(double weight){
    System.out.println("Double argument constructor");
}
    Cat(int age){
        System.out.println("Int argument constructor");
    }
    Cat(){
        System.out.println("0 arguments constructor called");
    }

    void printInfo(){
        System.out.println(name);
    }

    public static void main(String[] args) {


        Cat cat=new Cat("Axel","Blue");

       // cat.printInfo();
    }



}
