package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @author vike0906
* @since 2019-07-08
*/
public class DateTime {
	
	public static String dateFormat(Date date) {
		return dateFormat(date,"yyyy-MM-dd HH:mm:ss");
	}
	
	/**date 2 string*/
	public static String dateFormat(Date date,String format) {
		SimpleDateFormat sd = new SimpleDateFormat(format);
		return sd.format(date);
	}
	
	public static Date dateParse(String source) {
		return dateParse(source,"yyyy-MM-dd HH:mm:ss");
	}
	
	/**string 2 date*/
	public static Date dateParse(String source,String format) {
		SimpleDateFormat sd = new SimpleDateFormat(format);
		Date date =null;
		try {
			date =  sd.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	public static void main(String [] args) {
		System.out.println(dateFormat(new Date()));
		System.out.println(dateParse(dateFormat(new Date())));
	}
}
