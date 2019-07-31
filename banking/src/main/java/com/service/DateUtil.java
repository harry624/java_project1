package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public DateUtil() {
		// TODO Auto-generated constructor stub
	}

	public static Date getFormattedDate(String dateString) {
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");  
	    
	    Date date = null;
		try {
			date = formatter.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return date;
	}
}
