package com.time;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerSet {
	private static int counter = 0;
	
	 public String getTimerSet(){
		 
		 Timer timer = new Timer();
			timer.scheduleAtFixedRate(new TimerTask() {
				
				public void run() {
					counter++;
					System.out.println(counter);
					
				}
			},new Date(), 1000);
			
			try {
				Thread.sleep(9 * 1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("times up !!!");
			System.exit(0);
			return null;
		 
	 }

}
