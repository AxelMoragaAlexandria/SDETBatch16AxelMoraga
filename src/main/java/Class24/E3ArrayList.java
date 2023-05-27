package Class24;



import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {


        ArrayList<Character> characters=new ArrayList<>();
            characters.add('D');
            characters.add('E');
            characters.add('W');
        System.out.println(characters);
        System.out.println(characters.indexOf('E'));  //checks if the index of 'E'
        System.out.println(characters.contains('W'));// checks if array contains 'W'

        System.out.println(characters.isEmpty()); //checks array is empty
        characters.set(1,'H'); //replaces the character at specified index
        System.out.println(characters);






    }
}
