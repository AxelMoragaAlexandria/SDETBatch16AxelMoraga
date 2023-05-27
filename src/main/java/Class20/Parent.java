package Class20;

public class Parent{


        void getMarry(){
            System.out.println("Marry to the girl of our choice");
        }
        private void accessBankBalance(){
            System.out.println("Accessing Bank");
        }

        static void printNumber(){
            System.out.println(10);
        }
    }

    class Axel extends Parent{

        static void printNumber(){
            System.out.println(20);
        }

        @Override
        public void getMarry() {
            System.out.println("I want to marry Karol G");
        }
    }

    class ParentTester{
        public static void main(String[] args) {
            Axel axel=new Axel();
            axel.getMarry();
            Axel.printNumber();



        }
    }

