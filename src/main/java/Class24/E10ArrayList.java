package Class24;


import java.util.ArrayList;
import java.util.Iterator;

public class E10ArrayList {
    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.
         */

        ArrayList<String> words = new ArrayList<>();
        words.add("Nice");
        words.add("Beautiful");
        words.add("Abase");
        words.add("emote");

        words.removeIf(x->x.endsWith("e")); //removeIf going to place all the value of this list one by one. this condition
        //will be checked for each word
        System.out.println(words);
       

        /*

         while (iterator.hasNext()){ //checks if their is a element that needs to be iterated
             String word=iterator.next(); //means i++;
            if(word.endsWith("e")){
                iterator.remove();

            }
        }
        System.out.println(words);

         */




        //checks if their is a element that needs to be iterated
        //means i++;
        /*    for (int i = 0; i < words.size(); i++) {
                    String word=words.get(i);
                    if(word.endsWith("e")){
                        words.remove(i);
                        i--; //decremented i to avoid skipping elements, if I don't use it it skips a word that maybe ends with 'e'
                    }
        }
        System.out.println(words);

     */

    }
}