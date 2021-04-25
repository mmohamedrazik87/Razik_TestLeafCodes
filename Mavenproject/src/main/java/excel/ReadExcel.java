package excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/readExcel.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastRowNum);
		System.out.println(lastCellNum);
		for (int i = 1; i < lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				
				
			}
		
			
		}
		
	}

}
