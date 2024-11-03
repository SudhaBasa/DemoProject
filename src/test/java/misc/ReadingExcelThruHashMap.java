package misc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelThruHashMap {

	public static void main(String[] args) throws IOException {
		String filePath = "src/test/resources/TestData/Country.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");

		int row = sheet.getLastRowNum();

		HashMap<String, String> data = new HashMap<String, String>();

		// Reading data from excel to HashMap
		for (int r = 0; r <= row; r++) {

			String key = sheet.getRow(r).getCell(0).getStringCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();
			data.put(key, value);
		}

		//Read data from HashMap
		for(Map.Entry entry:data.entrySet())
		{
			System.out.println(entry.getKey()+" 	"+entry.getValue());
		}
		
		
	}

}
