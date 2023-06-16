package Class28;

import utils.Constant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args)  {

        try{
            FileInputStream fileInputStream=new FileInputStream(Constant.EXCEL_FILE_PATH);
        }catch(FileNotFoundException foundException){
            System.out.println("Hey the file you are trying to read is not found on the address specified");
        }







    }
}
