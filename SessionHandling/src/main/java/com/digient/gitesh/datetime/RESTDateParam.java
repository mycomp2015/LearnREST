package com.digient.gitesh.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RESTDateParam {	
	
	 private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	    
	    
	    public String getMyTime(){
	    	 Calendar cal = Calendar.getInstance();
		        //System.out.println(sdf.format(cal.getTime()));
			return sdf.format(cal.getTime());
	    	
	    }

}
