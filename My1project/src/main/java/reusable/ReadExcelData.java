package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelData {
    public static String getExcelData(String sheetName, int rowIndex, int columnIndex) throws IOException { // by paramatarised the method user inject testdata by rowindex,columnIndex
        FileInputStream fis=new FileInputStream(new File("src/main/resources/ilyastestdata/ilyasTestdataSheet.xlsx")); // always provide path by file class in fileinputstream
        XSSFWorkbook workbook=new XSSFWorkbook(fis);  // create an object for XSSFworksheet class & providing path of it by fileinputstream to read it
                                                    // now here acess the workbook
        XSSFSheet sheet=workbook.getSheet(sheetName);// access the sheet by parametrisied the method we get get testdata from user
             String data= sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();//by using sheet methods i.e getrow,getcell retrive the test values & getstringvalue to user input credentials
                                                             // it will store in string datatype with user variable name data
             return data;   // it will writtening string so in method change from void to string



    }
}
