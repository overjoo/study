package com.gmail.overjoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, input circle radius.");
		int r = sc.nextInt();
		double P = 2 * Math.PI * r;
		System.out.println(P);
	}

}
