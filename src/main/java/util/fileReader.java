package util;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileReader {
	public static void main(String args[]) {
try {
	System.out.println(getTestdata(1, 1));
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	public static String getTestdata(int row,int col) throws Exception {
		
		// obtaining input bytes from a file
				FileInputStream fis = new FileInputStream(new File(
						"C:\\Users\\Nandhini.devi\\eclipse-workspace\\selenium-Training\\automationpractice\\src\\main\\java\\util\\TestData.xlsx"));
				// creating workbook instance that refers to .xls file
				XSSFWorkbook wb = new XSSFWorkbook(fis);				
				 return wb.getSheet("Sheet1").getRow(row).getCell(col).getStringCellValue();			
	}
}
