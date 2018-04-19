package com.api.gitesh.commonservices.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TimeScheduling {
	 private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	    
	    
	    public String getMyTime(){
	    	 Calendar cal = Calendar.getInstance();
		        //System.out.println(sdf.format(cal.getTime()));
			return sdf.format(cal.getTime());
	    	
	    }

}
