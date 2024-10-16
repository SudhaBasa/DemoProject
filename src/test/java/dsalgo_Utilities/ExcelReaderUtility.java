package dsalgo_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mongodb.client.model.Field;

public class ExcelReaderUtility {
	
	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path=null;
	
	public ExcelReaderUtility(String path)
	{
		this.path=path;
	}
	
	public int getRowCount(String sheetName) throws IOException {
		
		fis=new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		workbook.close();
		fis.close();
	
		return rowCount;
	}
	
	public int getCellCount(String sheetName, int rowNum) throws IOException {
		
		fis=new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rowNum);
		int cellCount=row.getLastCellNum();
		workbook.close();
		fis.close();
		
		return cellCount;
	}
	
	public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {
		
		fis=new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rowNum);
		cell=row.getCell(colNum);
		
		DataFormatter formatter=new DataFormatter();
		String data;
		try {
			data=formatter.formatCellValue(cell); //returns the formatted value of a cell 
			//as a string regardless of the cell type
		} catch (Exception e) {

			data=" ";
		}
					workbook.close();
					fis.close();
		
		return data;
	}
	
	
	
	
	
	/*
	
	
	public void readdata() throws IOException {

		String filePath = "src/test/resources/TestData/Country.xlsx";
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("sheet1");

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
		}*/
		
		
	
	}


