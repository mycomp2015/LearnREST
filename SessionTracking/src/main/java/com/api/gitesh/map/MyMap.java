package com.api.gitesh.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyMap {

	public static void main(String[] args) throws NumberFormatException, IOException {

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
