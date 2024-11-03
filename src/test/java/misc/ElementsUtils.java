package misc;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.internal.invokers.TestMethodWithDataProviderMethodWorker;

import dsalgo_DriverFactory.DriverFactory;
import dsalgo_Utilities.ConfigReader;
import dsalgo_Utilities.Loggerload;

public class ElementsUtils {
	
	WebDriver driver=DriverFactory.getDriver();
	String excelPath=ConfigReader.getExcelFilePath();
	String code; 
	String result;
	
	public String getCodeFromExcel(String sheetname, int rownumber) throws IOException {
		
		//ExcelReader reader=new ExcelReader();
		List<Map<String, String>> testdata = ExcelReader.getData(excelPath, sheetname);
		code=testdata.get(rownumber).get("PythonCode");
		result=testdata.get(rownumber).get("result");
		return code;
	}
	
	public void enterCode(String code, WebElement element) {

		new Actions(driver).sendKeys(element, code).perform();
	}

	public void enterCodePractice(String code, WebElement element) {
		new Actions(driver).keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				element.sendKeys(Keys.BACK_SPACE);
			} else {
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.RETURN);
			}
		}
	}
		public String getResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
			//ExcelReader reader = new ExcelReader();
			List<Map<String, String>> testdata = ExcelReader.getData(excelPath, sheetname);
			result = testdata.get(rownumber).get("Result");
			Loggerload.info("Expected result from Excel sheetname " + sheetname + " and " + rownumber + " : " + result);
			return result;
		}	
	
	

}
