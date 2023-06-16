package Class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constant;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(Constant.EXCEL_FILE_PATH);


        //That special class which knows how to read the data from EXCEL Files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        //This code will store it into my Java Program
        List<Map<String,String>>ExcelData=new ArrayList<>();
        Row headerRow=sheet.getRow(0);
        int rowSize=sheet.getPhysicalNumberOfRows();

        for (int row = 1; row <rowSize; row++) {
            Row rows=sheet.getRow(row);
            int ColumnSize=rows.getPhysicalNumberOfCells();

            Map<String,String>rowMap=new HashMap<>();
            for (int column = 0; column <ColumnSize; column++) {
                String key=headerRow.getCell(column).toString();
                String value=rows.getCell(column).toString();
                rowMap.put(key,value);
            }
            ExcelData.add(rowMap);

        }
        System.out.println(ExcelData);








    }
}
