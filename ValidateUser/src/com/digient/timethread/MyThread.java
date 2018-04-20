package com.digient.timethread;

import java.util.Timer;

public class MyThread {

	public String userUpdateTime() {
		Timer timer=new Timer();
		timer.schedule(new MyTimerTask(), 1000,2*1000);
		
		try{
			//Thread.sleep(Long.MAX_VALUE);
			Thread.sleep(10);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.exit(0);
		
		return null;		
	}
}
