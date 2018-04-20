package com.digient.api.validation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.digient.api.dategen.DateGen;
import com.digient.timethread.MyThread;


public class ValidateRequest {
	public static DateGen sysDateGen=new DateGen();
	public static MyThread myThread=new MyThread();
	
	private static final DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	public static Date d1 = null;
	public static Date d2 = null;
	
	Map<Integer,String> userLastRequest = new HashMap<Integer, String>();

	public void updateUserRequest(int userId, String currentTimer) {
		userLastRequest.put(userId, currentTimer);
		
	}

	public void removeIdealSession() {
		System.out.println("org userLastRequest : " + userLastRequest);
		
		String syscurTime = sysDateGen.getMyTimeOn();		
		//String syscurTime = myThread.userUpdateTime();
		
		//String previousTime = getMinusTimer(15, myThread.userUpdateTime());
		
		
		List<Integer> removeUserIds = new ArrayList<>();
		for(Map.Entry<Integer, String> entry : userLastRequest.entrySet()) {		
			
			if(entry.getValue().equals(syscurTime)){
				
				if(!removeUserIds.contains(entry.getKey())) {
					removeUserIds.add(entry.getKey());	
				}
			}			
		}
		
		if(!removeUserIds.isEmpty()){
			for(Integer id : removeUserIds) {
				userLastRequest.remove(id);
			}
		}
		System.out.println("=================");
		System.out.println("userLastRequest : " + userLastRequest);		
	}
	 public static String getMinusTimer(int timer, String time) {
		  Date date=null;
		  try {
		   date = getDateTimeFormat().parse(time);
		  } catch (ParseException e) {
		   e.printStackTrace();
		  }
		  date.setSeconds(date.getSeconds()-timer);
		        return getDateTimeFormat().format(date).toString();
		 }
	 private static DateFormat getDateTimeFormat() {
		  return new SimpleDateFormat("HH:mm:ss");
		 }
	
}
