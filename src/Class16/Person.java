package Class16;

import java.util.Scanner;

public class Person {
public String name="Axel";
    String SSN="1234567899";
   private String password;
   static double bankBalance=12000;
  private void printPassword(){
       System.out.println(password);
   }

   private static void printBalance(){
       System.out.println(bankBalance);
   }
//no other class can't access this and won't know it is there

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printPassword();
        System.out.println(bankBalance);
        System.out.println(farwa.SSN);
        System.out.println(farwa.name);






    }

}
