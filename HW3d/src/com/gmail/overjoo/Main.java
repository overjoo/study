package com.gmail.overjoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// enter string and count b's in the string
		Scanner sc = new Scanner (System.in);
		String l = sc.nextLine();
		char [] cl = l.toCharArray();
		int b = 0;
		for (int i = 0; i < cl.length; i++) {
			if (cl[i] == 'b') b++;
		}
		System.out.println(b);
		
	}

}
