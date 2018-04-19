package com.api.gitesh.map;

import java.util.HashMap;
import java.util.Map;

import com.api.gitesh.commonservices.time.TimeScheduling;
import com.time.MyTimerSet;

public class MapDemo2 {

	public static void main(String[] args) {
		TimeScheduling time=new TimeScheduling();
		//TimerGen timeGen=new TimerGen();
		//TimerTest2 test=new TimerTest2();
		MyTimerSet myTimerSet=new MyTimerSet();
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(101,"gitesh");
		map.put(102, "vinod");
		map.put(103, "Rajesh");
		
		
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println( entry.getKey() + " = " + entry.getValue() +"-> Entry time : "+
					time.getMyTime() +"-> Hello your  time is satarted now  : "+myTimerSet.getTimerSet());

		}

	}

}
