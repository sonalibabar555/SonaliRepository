package ReadExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

private static final Row Ro = null;

//Read the data from IPL Sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide te path 
Workbook w = WorkbookFactory.create(fis);
Sheet sh = w.getSheet("Sheet1");//get into sheet
Row Ro = sh.getRow(1);//get into desired row
Cell Ce = Ro.getCell(0);//get into desired cell/col
String data = Ce.getStringCellValue();//get the value from cell/col
Thread.sleep(2000);
System.out.println(data);

}
}
