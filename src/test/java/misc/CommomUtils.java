package misc;

import java.util.Date;

public class CommomUtils {
	
	public static String getEmailWithTimeStamps() {
		Date date=new Date();
		return "numpy"+date.toString().replace(" ","_").replace(":","_")+"@gamil.com";
	}

}
