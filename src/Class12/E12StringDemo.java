package Class12;

public class E12StringDemo {
    public static void main(String[] args) {

        String sentence="yup we have another class";
        //substring is used to get a part of the complete string
        System.out.println(sentence.substring(4));
        System.out.println(sentence.substring(4,11));
        System.out.println(sentence.substring(12,19));
        System.out.println(sentence.substring(20,25));


        int startIndex=sentence.length()-5;
        System.out.println(sentence.substring(startIndex));




    }
}
