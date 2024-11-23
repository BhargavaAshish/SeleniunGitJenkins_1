package readExcelExample;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		
		//create an object of Excel
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		//index
		XSSFSheet sheet =workbook.getSheetAt(0);
		//name
//		XSSFSheet sheet = workbook.getSheet("smokeTest");
		
		
		
//		int actualRowCount = (sheet.getLastRowNum() - sheet.getFirstRowNum()) + 1;
//		int actualFirstCount = sheet.getFirstRowNum();
//		
//		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
//		System.out.println("actualFirstCount Count: " + actualFirstCount + " : " + sheet.getLastRowNum());
//		System.out.println("actualRowCount Count: " + actualRowCount);
		System.out.println("Row Count: " + rowCount);				//5
		System.out.println("Column Count: " + columnCount);
		
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			//0,1,2,3,4
			
			String fname = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(4).toString();
			System.out.println("details are: " + fname + " : " + address);
			System.out.println("===============================");
			
		}

	}

}
