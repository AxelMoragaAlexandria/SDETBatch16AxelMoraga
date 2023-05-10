package Class18;
/*
Write program to inherit class D that has method
printF which is static and call or reuse that method into class E

 */
public class classD {

   static  void printF(){
        System.out.println("Hello");
    }
}

class classE extends classD{
    public static void main(String[] args) {
        classE.printF();
    }


}
