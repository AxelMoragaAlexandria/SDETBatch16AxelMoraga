package Class14;

public class Printer {


    void printWord(String word){
        System.out.println(word);
    }
    /*
    void==> returnType of the method such as void means this method does not return any data
    other examples of return types can be String,int,boolean,char,Dog,Cat,etc.

    //printWord==> it's the name of te method
     (String word) ==> parameters/inputs
     {
        System.out.println(word);
    } ==>body of the method you can like write if else conditions, loops.

  */

    public static void main(String[] args) {
        //we are creating an object of the E1Methods class
        // in Java all the classes can be created as data types
        //new E1Methods();==> creating the objects of the E1Methods class
        Printer obj = new Printer();
        // we are calling the printWord()method on obj object and passing "Java"
        // as argument or input
        obj.printWord("Java");
    }


}



