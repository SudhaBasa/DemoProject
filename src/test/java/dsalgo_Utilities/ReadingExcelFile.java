package dsalgo_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws IOException {

		String excelFilePath = "src/test/resources/TestData/Country.xlsx";
		FileInputStream inputStream = new FileInputStream(excelFilePath);

		XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
		// XSSFSheet sheet=workBook.getSheet("Sheet1");
		XSSFSheet sheet = workBook.getSheetAt(0);

		// Using Iterator

		Iterator iterator = sheet.iterator();

		while (iterator.hasNext()) {

			XSSFRow row = (XSSFRow) iterator.next();
			Iterator cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIterator.next();
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case FORMULA:
					System.out.print(cell.getNumericCellValue());
					break;
				}
				System.out.print("  |  ");
			}
			System.out.println();

		}
		
		/*
		 * //using For Loop int rows=sheet.getLastRowNum(); int
		 * columns=sheet.getRow(1).getLastCellNum();
		 * 
		 * //to iterate rows for(int currentRow=0;currentRow<=rows;currentRow++) {
		 * XSSFRow row=sheet.getRow(currentRow);
		 * 
		 * //to iterate columns for(int currentCol=0;currentCol<=columns;currentCol++) {
		 * 
		 * XSSFCell cell= row.getCell(currentCol); switch(cell.getCellType()) { case
		 * STRING: System.out.println(cell.getStringCellValue()); break; case
		 * NUMERIC:System.out.println(cell.getNumericCellValue()); break; case
		 * BOOLEAN:System.out.println(cell.getBooleanCellValue()); break; } }
		 * System.out.println(); }
		 */


	}

}
