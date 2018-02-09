package niu.com.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {
	public static Date StrToDate(String str, String pattern) {
		SimpleDateFormat fromat = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = fromat.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
}
