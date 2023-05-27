package Class25;

import java.util.LinkedHashSet;

public class Task3 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {

        LinkedHashSet<String>cities=new LinkedHashSet<>();
            cities.add("Washington DC");
            cities.add("New York");
            cities.add("Aviana");
            cities.add("Houston");
            cities.add("Dallas");
        cities.add("Arlington");
        cities.removeIf(a->a.startsWith("A"));
        System.out.println(cities);







    }
}
