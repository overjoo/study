package com.gmail.overjoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// one cycle for *** painting
		Scanner sc = new Scanner (System.in);
		int lmax = sc.nextInt();
		for (int i = 0; i < (lmax * 2); i ++) {
			int n = lmax - Math.abs(lmax - i);
			String g = new String(new char[n]).replace("\0", "*");
			System.out.println(g);
		}

	}

}
