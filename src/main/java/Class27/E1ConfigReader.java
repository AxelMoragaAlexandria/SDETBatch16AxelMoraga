package Class27;

import utils.ConfigReader;
import utils.Constant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
1. Get the location of the file
2. Either navigate to that file or bring that file to the memory
3.
 */
public class E1ConfigReader {
    public static void main(String[] args) throws IOException {


        //System.getProperty("user.dir") gives you the path till your project

        String path1=System.getProperty("user.dir")+"/Files/Config.properties";

        //Brings the data from the file in the form of bytes
        FileInputStream fileInputStream=new FileInputStream(path1);

        // converts the data in the form of key values pairs.
        Properties prop=new Properties();
        prop.load(fileInputStream);

        System.out.println(prop.get("userName"));
        System.out.println(prop);








    }
}
