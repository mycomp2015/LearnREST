package com.api.gitesh.commonservices.time;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeCountingEvent {
	private static int counter = 0;

	public static void main(String[] args) {
		System.out.println("Hello your  time is satarted now :");

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				counter++;
				System.out.println(counter);
			}
		}, new Date(), 1000);

	}

}
