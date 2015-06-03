package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class DateValidator {
 
	public static boolean isThisDateValid(String dateToValidate, String dateFormat){
 
		if(dateToValidate == null){
			return false;
		}
 
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setLenient(false);
 
		try {
 
			//if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);
			
 
		} catch (ParseException e) {
			return false;
		}
 
		return true;
	}
 
}