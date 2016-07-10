package com.gmail.overjoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringSum(3, 5.0, "abc"));

	}
	static String stringSum(int a, double b, String c) {
		String r = (c + (a + b));
		return r;
	}
}
