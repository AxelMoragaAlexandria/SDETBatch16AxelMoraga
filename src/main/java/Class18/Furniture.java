package Class18;

public class Furniture {

    String color="Black";
}

class Chair extends Furniture{

        String color="White";

        void printColor(){
            String color="Blue";
            System.out.println(super.color); //Black
            System.out.println(color); //Blue
            System.out.println(this.color);//White
        }
    }

    class FurnitureTester{
        public static void main(String[] args) {
            Chair chair=new Chair();
            chair.printColor();
        }

    }
