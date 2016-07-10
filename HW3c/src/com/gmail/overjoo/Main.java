package com.gmail.overjoo;

public class Main {

	public static void main(String[] args) {
		// random array lengh 15 and second array lengh 30 with first array + first array*2
		int [] a = new int [15];
		int [] b = new int [30];
		for (int i = 0; i < a.length; i++) {
			double t = Math.random() * 10;
			a[i] = (int) t;
			
		}
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int i = a.length; i < b.length; i++) {
			b[i] = a[i - a.length] * 2;
			
		}
		System.out.print("First array: ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.print("Second array: ");
		for (int i : b) {
			System.out.print(i + " ");
			
		}
	}

}
