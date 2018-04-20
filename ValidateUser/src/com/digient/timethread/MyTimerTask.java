package com.digient.timethread;

import java.util.TimerTask;

import com.digient.api.dategen.DateGen;



public class MyTimerTask extends TimerTask{

	DateGen time=new DateGen();
	@Override
	public void run() {
		time.getMyTimeOn();
		
	}

}
