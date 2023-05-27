package Class24;

import java.util.ArrayList;

public class E12ArrayList {
    public static void main(String[] args) {
/*
//Create an arrayList of drinks call it. If any drink has letter “a” or “e” replace it with water
 */

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("Lemonade");
        drinks.add("Vodka");
        drinks.add("Tequila");

       for (int i = 0; i < drinks.size(); i++) {
            String name=drinks.get(i);
            if(name.contains("e")|| name.contains("a")){
                drinks.set(i,"water"); //Set method replaces the one value with another value

            }
        }
        System.out.println(drinks);






        // drinks.replaceAll(x->x.contains("a")||x.contains("e")?"water":x);



        // String word=10>8?"Water":"milk";

     /*   String word2;
        if(10>8){
            word2="Water";
        }else{
            word2="Milk";

        }

      */
    }
}
