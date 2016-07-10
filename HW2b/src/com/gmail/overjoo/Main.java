package com.gmail.overjoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int app = sc.nextInt();
		if (app < 1 || app > 144) {
			System.out.println("WRONG");
			System.exit(1);
		}
		int house, floor;
			if (app % 36 == 0) {
				house = app / 36;
				System.out.println(house + " подъезд");
			}
			else {
				house = app / 36 + 1;
				System.out.println(house + " подъезд");
			}
		int cleanapp = app - 36 * (house - 1);
	    	if (cleanapp % 4 == 0) {
	    		floor = cleanapp / 4;
	    		System.out.println(floor + " этаж");
	    	}
	    	if (cleanapp % 4 != 0) {
	    		floor = cleanapp / 4 + 1;
	    		System.out.println(floor + " этаж");
	    	}
}
}


