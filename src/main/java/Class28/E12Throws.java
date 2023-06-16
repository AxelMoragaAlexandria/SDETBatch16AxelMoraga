package Class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E12Throws {
    public static void main(String[] args)  {

        try{
            Print();
        }catch(Exception e){
            System.out.println("nice");
        }


    }

    static void Print() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("sdsd");
    }
}
