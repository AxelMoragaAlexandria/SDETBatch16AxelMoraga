package class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class E13Excel {
    public static void main(String[] args) {

        String path=System.getProperty("user.dir")+"/Files/Employees.xlsx";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
           Sheet sheet= xssfWorkbook.getSheet("Sheet1");

            List<Map<String,String>>data=new ArrayList<>();
            Row headerRow=sheet.getRow(0);
         int rowSize=sheet.getPhysicalNumberOfRows();
            for (int i = 1; i <rowSize; i++) {
               Row row= sheet.getRow(i);

                LinkedHashMap<String,String>linkedHashMap=new LinkedHashMap<>();
             int columnSize=row.getPhysicalNumberOfCells();
                for (int j = 0; j <columnSize ; j++) {
                    String key=headerRow.getCell(j).toString();
                    String value=row.getCell(j).toString();
                 linkedHashMap.put(key,value);
                }
            data.add(linkedHashMap);
            }
        }catch(IOException e){
            e.printStackTrace();
        }




    }
}
