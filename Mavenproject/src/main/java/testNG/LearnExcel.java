package testNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LearnExcel {
	@Test
	public static void main() throws IOException {
		// TODO Auto-generated method stub
		// open the excel
		XSSFWorkbook wb = new XSSFWorkbook("./data/createLead.xlsx");
		// go to sheet
		XSSFSheet workSheet = wb.getSheet("Sheet1");
		// get last row number
		int lastRowNum = workSheet.getLastRowNum();
		// get last cell number
		short lastCellNum = workSheet.getRow(0).getLastCellNum();

		// get row details
		for (int i = 1; i < lastRowNum; i++) {
			// get column details
			for (int j = 0; j < lastCellNum; j++) {

				// get the cell value of row number 1 and store that in value
				String value = workSheet.getRow(i).getCell(j).getStringCellValue();
				// print the value
				System.out.println(value);

			}

		}
		wb.close();

	}

}
