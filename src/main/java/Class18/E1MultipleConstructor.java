package Class18;

public class E1MultipleConstructor {
    public static void main(String[] args) {


        String str=new String("Java");
            char[]chars={'J','a','v','a'};
            String str1=new String(chars);
            //extract java and convert it into upper case
            char[]chars2={'t','h','e','J','a','v','a'};
            String str2=new String(chars2,3,4);
        System.out.println(str2.toUpperCase());







    }
}
