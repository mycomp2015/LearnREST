package com.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimerGen {
	
	 private static final DateFormat sdf = new SimpleDateFormat("HH:mm:ss");	    
	 MyTimerSet myTimerSet =new MyTimerSet();
	 
	    public String getMyTime(){
	    	 Calendar cal = Calendar.getInstance();
		        //System.out.println(sdf.format(cal.getTime()));
			return sdf.format(cal.getTime());
	    	
	    	
	    }

}
