package Class26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/*
Create a map of a building. Store floor number and its associated company name. (Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class Task1 {
    public static void main(String[] args) {


        Map<Integer,String>companys=new LinkedHashMap<>();
            companys.put(1,"Google");
            companys.put(2,"Syntax");
            companys.put(3,"Microsoft");
            companys.put(4,"Amazon");
            companys.put(5,"Target");
             companys.put(5,"Target");
            companys.put(6,"Youtube");
            companys.put(7,"Best buy");

        System.out.println(companys.size());
        companys.replace(4,"Trader Joes");
        companys.remove(7);
        System.out.println(companys);










    }
}
