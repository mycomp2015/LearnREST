package com.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class TimerTest2 {

	public String getTime() {
		Timer timer = new Timer();

		timer.schedule(new MyTimerTask(), 1000, 1000);

		// Stopping the timer thread after some time for example :10 secs.

		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("**************************");
		System.out.println("Timer tasks finished on " + convertTimeToDateFormat(System.currentTimeMillis()));

		System.exit(0);

		return null;

	}

	public static String convertTimeToDateFormat(long milliseconds) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");
		Date resultdate = new Date(milliseconds);
		return sdf.format(resultdate);
	}

}
