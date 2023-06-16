package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class E2ExcelFile {
    public static void main(String[] args) throws IOException {
//Objective adding more data in a existing file
        //Relative Path
        String path="Files/Employees.xlsx";

        //We use FileInStream to read the exisiting data and not want to lose the existing data.
        FileInputStream fileInputStream=new FileInputStream(path);

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
       Sheet sheet= xssfWorkbook.getSheet("Sheet1");
     Row row=sheet.createRow(5);
     row.createCell(0).setCellValue("Moncef");
     row.createCell(1).setCellValue("M");
     row.createCell(1).setCellValue("Belgas");
     //creates an empty file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //data is written on  that file
        xssfWorkbook.write(fileOutputStream);










    }
}
