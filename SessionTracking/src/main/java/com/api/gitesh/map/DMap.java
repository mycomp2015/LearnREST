package com.api.gitesh.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.time.TimerGen;

public class DMap {
	public static TimerGen time=new TimerGen();
	public static void main(String[] args) {
		
	Map<Integer,Map <Integer,String>> sizemap=new HashMap<Integer,Map <Integer,String>>();
		
		Map <Integer,String> map = new HashMap<Integer, String>();
			Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size=sc.nextInt();
		System.out.println("Enter id : ");
		System.out.println("sr.no **id**"+"-----"+"**Your entered time**"+"---"+"** Your current time **");
		int id;
		for(int i=1;i<=size;i++){
			id=sc.nextInt();
			System.out.println(i+".   : "+id+"            "+time.getMyTime()+"                  "+time.getMyTime());
			map.put(id, time.getMyTime());
			sizemap.put(i, map);
			//System.out.println(map.keySet()+""+map.values());
			//System.out.println(map.values());
			
		}
		System.out.println(sizemap);	
	
	}

}
