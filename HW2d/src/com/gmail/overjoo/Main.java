package com.gmail.overjoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// обои
		Scanner sc = new Scanner (System.in);
		int lines = sc.nextInt();
		for (int c = 0; c < 5; c++) {
		for (int x = 0; x < lines; x++) {
			if (x % 2 == 0) {
				System.out.print("***");
		}
			else System.out.print("+++");
	}
		System.out.println();
	}
}
}