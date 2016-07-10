package com.gmail.overjoo;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// searches an array of int for specific int
		int [] array = {1, 4, 6, 3, 11, 31};
		int element = 0;
		System.out.println(arraySearch(element, array));
		

	}
	static int arraySearch(int element, int [] array) {
		for (int i = 0; i < array.length; i++) {
			if (element == array[i]) return i;
		}
		return -1;
	}
	
}
