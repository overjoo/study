package com.gmail.overjoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// simple number from 1 to 100
		
		for (int i = 2; i < 100; i++){
			outerloop:
			for (int ii = 2; ii < 100; ii++){
				//System.out.println(i + " " + ii);
				if (i % ii == 0 && i != ii) break outerloop;	
				if (i % ii == 0 && i == ii) {
					System.out.println(i);
					break outerloop;
				}
			}
		}
		
}
}