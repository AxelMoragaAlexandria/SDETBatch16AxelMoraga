package Class24;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

        ArrayList<String> makeUp=new ArrayList<>();
        makeUp.add("NailPolish");
        makeUp.add("LipStick");
        makeUp.add("Blush");

        ArrayList<String> fruit=new ArrayList<>();
            fruit.add("Apple");
            fruit.add("Banana");

            ArrayList<String> grocery=new ArrayList<>();
                grocery.addAll(makeUp);
                grocery.addAll(fruit);
        System.out.println(grocery);







    }
}
