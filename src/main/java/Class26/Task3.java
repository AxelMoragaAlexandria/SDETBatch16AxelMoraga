package Class26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class Task3 {
    public static void main(String[] args) {

        Map<Integer,String>BestBuy=new LinkedHashMap<>();
        BestBuy.put(49493,"TV");
        BestBuy.put(10203,"Phone");
        BestBuy.put(3200,"Washer");
        BestBuy.put(3993,"Speaker");





        for(Map.Entry<Integer,String>product:BestBuy.entrySet()){
            System.out.println(product.getKey()+" "+product.getValue());
        }


    }
}
