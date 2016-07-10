package com.gmail.overjoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {0,5,2,4,7,1,3,19,2, 4, 6, 1};
		int n = 0;
		for (int i : a) {
			if (i % 2 != 0) n++;
		}
		System.out.println(n);
	}

}
