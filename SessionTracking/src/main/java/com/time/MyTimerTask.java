package com.time;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask{
	TimerGen time=new TimerGen();
	@Override
	public void run() {
		System.out.println("Executing timer task on "+time.getMyTime());
		
	}

}
