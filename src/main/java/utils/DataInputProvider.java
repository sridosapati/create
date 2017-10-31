package utils;


import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class DataInputProvider{
	public Object [][] getSheet(String dataSheetName) throws InvalidFormatException, IOException{

		File infowbook = new File("./data/"+dataSheetName+".xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(infowbook);
		XSSFSheet sheetName = wbook.getSheetAt(0);

		int rowCount = sheetName.getLastRowNum();	// To get no.of Row 
		System.out.println("Number of rows :"+rowCount);

		int columnCount = sheetName.getRow(0).getLastCellNum();	// To get no.of Column 	
		System.out.println("Number of Column :"+columnCount);

		Object[][] data = new Object[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {			// Iteration of I
			XSSFRow row = sheetName.getRow(i);

			for (int j = 0; j < columnCount; j++) {		// Iteration of I
				XSSFCell cell = row.getCell(j);
				//	String data = cell.getStringCellValue();
				//System.out.println(data);

				data[i-1][j] = cell.getStringCellValue();
			}
		}	wbook.close();
		return data ;
	
	}
}