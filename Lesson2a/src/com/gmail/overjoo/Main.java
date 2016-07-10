package com.gmail.overjoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double totalSum;
		System.out.println("Input r");
		int r = sc.nextInt();
		double rashod = 7.5;
		double value = 24.09;
		
		totalSum = r * 2 * rashod * value / 100;
		System.out.println(totalSum);
		sc.close();
	}

}
