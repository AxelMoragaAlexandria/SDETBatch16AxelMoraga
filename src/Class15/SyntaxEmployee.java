package Class15;

public class SyntaxEmployee {

/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */


    String empID;

    double salary;

    static String CEO="Sumair";


    public static void main(String[] args) {
            SyntaxEmployee employee1= new SyntaxEmployee();
            employee1.empID="Acmska10101";
            employee1.salary=100000;
        System.out.println(SyntaxEmployee.CEO); //99.9 this is how they are used

            SyntaxEmployee employee2= new SyntaxEmployee();
            employee2.empID="Abdjs01920";
            employee2.salary=125.000;
            SyntaxEmployee.CEO="Sumair";

        System.out.println(employee1.empID);
        System.out.println(employee2.empID);




    }




}
