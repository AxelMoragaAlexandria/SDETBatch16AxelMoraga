package Class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constant;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(Constant.EXCEL_FILE_PATH);


        //That special class which knows how to read the data from EXCEL Files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        //This Nested For loop will get all the data from the Spreadsheet.
        int rowSize=sheet.getPhysicalNumberOfRows();
        for (int row = 0; row <rowSize; row++) {
            Row rows=sheet.getRow(row);
            int ColumnSize=rows.getPhysicalNumberOfCells();
            for (int column = 0; column <ColumnSize; column++) {
                System.out.print(rows.getCell(column)+" ");
            }
            System.out.println();
        }


      /*  Cell cell=row.getCell(0);
        System.out.print(row.getCell(0)+" ");
        System.out.print(row.getCell(1)+" ");
        System.out.print(row.getCell(2)+" ");
        System.out.print(row.getCell(3)+" ");
        System.out.print(row.getCell(4)+" ");

       */


    }
}
