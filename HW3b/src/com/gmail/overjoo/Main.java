package com.gmail.overjoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// array manual creation and filling
		Scanner sc = new Scanner (System.in);
		System.out.println("Input arrays lengh");
		int a = sc.nextInt();
		int [] arr = new int [a];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Input array number " + (i + 1) + " out of " + a);
				arr[i] = sc.nextInt();
			}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}