package com.digient.api.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.digient.api.dategen.DateGen;
import com.digient.api.validation.ValidateRequest;

public class UsersRequest {
	
	public static DateGen time=new DateGen();
	
	public static void main(String[] args) {
		
		Map<Integer,Map<Integer,String>> userMap=new HashMap<Integer,Map<Integer,String>>();		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		
		
		ValidateRequest validateRequest = new ValidateRequest();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size=sc.nextInt();
		System.out.println("Enter id : ");
		System.out.println("sr.no **id**"+"-----"+"**Your entered time**");
		int userId;
		for(int i=1;i<=size;i++){
			userId=sc.nextInt();
			System.out.println(i+".   : "+userId+"            "+time.getMyTimeOn());
			validateRequest.updateUserRequest(userId,time.getMyTimeOn());
			
			map.put(userId, time.getMyTimeOn());
			userMap.put(i, map);
			//validateRequest.removeIdealSession();
		}
		//System.out.println(userMap);	
		validateRequest.removeIdealSession();
		
	}

}
