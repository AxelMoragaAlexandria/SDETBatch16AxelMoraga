package Class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {


        /*
        1. Software
        2. Path
        3. Store the file
         */

        String path=System.getProperty("user.dir")+"/TestExcelFile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
     //   Sheet sheet=xssfWorkbook.createSheet("Sheet1");

        Row row= sheet.createRow(0);
       Cell cell= row.createCell(0);
       Cell cell1=row.createCell(1);
       cell.setCellValue("Wael");
       cell1.setCellValue("Jacob");


       //FileOutputStream is used when we have to create a new file or we write data to a file
        FileOutputStream fileOutputStream=new FileOutputStream
                //Here we put in the path and write the name of the file
                (path);
//This is going to write the data in the file
        xssfWorkbook.write(fileOutputStream);







    }
}
