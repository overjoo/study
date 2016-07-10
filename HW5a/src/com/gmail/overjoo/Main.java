package com.gmail.overjoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {-3, -6, -1, -100};
		System.out.println(arrayMax(ar));
	}
	static int arrayMax(int [] a) {
		int x = a[0];
		for (int i : a) {
			if (i > x) x = i;
		}
		return x;
	}
}
