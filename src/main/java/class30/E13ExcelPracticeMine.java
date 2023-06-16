package class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class E13ExcelPracticeMine {
    public static void main(String[] args) {

        String path=System.getProperty("user.dir")+"/Files/Employees.xlsx";
        FileInputStream fileInputStream=null;
        XSSFWorkbook xssfWorkbook=null;
        try {
            fileInputStream = new FileInputStream(path);
             xssfWorkbook=new XSSFWorkbook(fileInputStream);
        }catch(IOException e){
            e.printStackTrace();
        }


            Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        List<Map<String,String>>data=new ArrayList<>();


       Row headerRow= sheet.getRow(0);
      int rows= sheet.getPhysicalNumberOfRows();

        for (int i = 1; i <rows; i++) {
            Row row=sheet.getRow(i);

            Map<String,String>map=new LinkedHashMap<>();
           int columnSize= row.getPhysicalNumberOfCells();
            for (int j = 0; j < columnSize; j++) {
                 String key=headerRow.getCell(j).toString();
                 String value=row.getCell(j).toString();
                 map.put(key,value);
            }
            data.add(map);
        }
        System.out.println(data);
    }
}
