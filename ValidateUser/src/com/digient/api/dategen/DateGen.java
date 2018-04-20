package com.digient.api.dategen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateGen {
	private static final DateFormat sdf = new SimpleDateFormat("HH:mm:ss");	   
	
	    public String getMyTimeOn(){
	    	 Calendar cal = Calendar.getInstance();
			return sdf.format(cal.getTime());  	
	    	
	    }
	    
	    
	    
	    
	   /* public static void main(String[] args) throws ParseException {
	    	DateGen gen=new DateGen();
	    	
	    	String dateStart = "10:23:8";
	    	String dateStop = "10:31:48";
	    	
	    	//String dateStart =gen.getMyTime();
	    	//String dateStop = gen.getMyTime();
	    	
	    	Date d1 = null;
			Date d2 = null;
			
			
			
			
			d1 = sdf.parse(dateStart);
			d2 = sdf.parse(dateStop);
	    	
			long diff = d2.getTime() - d1.getTime();
			
			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			
			System.out.print(diffHours + ":");
			System.out.print(diffMinutes + ":");
			System.out.print(diffSeconds + "");
			
			System.out.println();
	    	
			System.out.println("difference in sec : "+diffSeconds);
	    	System.out.println("diff in min : "+diff/(60 * 1000) % 60);
	    	
		}*/
	    
}
