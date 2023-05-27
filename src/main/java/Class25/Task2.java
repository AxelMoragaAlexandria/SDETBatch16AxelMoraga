package Class25;

import java.util.HashSet;
import java.util.TreeSet;

public class Task2 {
    /*
    Create a Set in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
     Using 2 different ways retrieve all elements from set.

     */
    public static void main(String[] args) {

        HashSet<String>countries=new HashSet<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Guatemala");
        countries.add("Argentina");
        countries.add("Germany");
        countries.add("Japan");

        TreeSet<String>pais=new TreeSet<>(countries);
        System.out.println(pais);

        for(String c:pais){
            System.out.println(c);
        }







    }
}
