package Class21;

public class ParentTwo {


        final int numofMonthsInYear=12;

        final void getMarry(){
            // numofMonthsInYear=13;
            System.out.println("Marry Shakira");
        }
        void study(){
            System.out.println("Study medicine");
        }

    }
    class Axel extends ParentTwo {

        final int noOfHoursInADay=24;
        @Override
        void study(){
            System.out.println(numofMonthsInYear);
            System.out.println("No I want SDET");
        }
    }

