package Class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constant;

import java.io.FileInputStream;
import java.io.IOException;

public class E3ExcelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(Constant.EXCEL_FILE_PATH);


        //That special class which knows how to read the data from EXCEL Files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //Telling it to get the sheet
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        //Get row 3
        Row row= sheet.getRow(3);
        //Get Column 3
        Cell cell= row.getCell(3);
        System.out.println(cell);






    }
}
