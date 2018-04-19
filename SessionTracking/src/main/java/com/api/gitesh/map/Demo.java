package com.api.gitesh.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter size : "); int size = sc.nextInt();
		 * 
		 * String name;
		 * 
		 * for (int i = 0; i < size; i++) {
		 * 
		 * 
		 * }
		 */
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter total size : ");
		int totalSize = Integer.parseInt(br.readLine());
		System.out.println("Enter your name :");
		for (int i = 1; i <= totalSize; i++) {
			//System.out.println("Enter your name : ");
			String name = br.readLine();
			System.out.println("Entered "+i + " Name " + name);
			

		}

	}

}

/*Map<Integer, String> hm = new HashMap<Integer, String>();
// add key-value pair to hashmap

hm.put(101, "Gitesh");
hm.put(102, "Vinod");
hm.put(103, "Rajesh");

System.out.println(hm);
Set<Integer> keys = hm.keySet();

for (Integer key : keys) {
	System.out.println("Value of " + key + " is: " + hm.get(key));

}*/
