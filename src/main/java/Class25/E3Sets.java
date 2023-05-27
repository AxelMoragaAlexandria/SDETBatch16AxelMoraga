package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names);

        HashSet<String> uniqueNames=new HashSet<>();
        uniqueNames.add("B");
        uniqueNames.add("Z");
        uniqueNames.add("C");
        System.out.println(uniqueNames);

        //There is no get method in sets uniNames.get(0)
       // System.out.println(uniqueNames);

        for(String name:uniqueNames){
            System.out.println(name);
        }

    }
}
