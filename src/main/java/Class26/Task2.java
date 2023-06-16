package Class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop.
Print all values from a country map using for each loop and iterator.
 */
public class Task2 {
    public static void main(String[] args) {

        Map<String,String>countries=new TreeMap<>();
        countries.put("Bolivia","La Paz");
        countries.put("China","Beijing");
        countries.put("Ecuador","Equito");
        countries.put("Germany","Berlin");


     // Set<String>countrySet=countries.keySet();
        for(String c:countries.keySet()){
            System.out.println(c);
        }
        System.out.println("*************************");
        for(String d: countries.values()){
            System.out.println(d);
        }


        for(Map.Entry<String,String> entry: countries.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }








    }
}
