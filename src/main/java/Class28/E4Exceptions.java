package Class28;

public class E4Exceptions {
    public static void main(String[] args) {


    try {
       // "name".charAt(10);
        //System.out.println(10/0);
        String name=null;
        name.length();
       // int[]arr=new int[-5];

        
    }catch(StringIndexOutOfBoundsException e){
        System.out.println("Plan B");
    }catch(NegativeArraySizeException e){
        System.out.println("Plan C");
    }catch(ArithmeticException e){
        System.out.println("Plan D");
    }catch(Exception e){
        System.out.println("Plan F");
    }



    }
}
