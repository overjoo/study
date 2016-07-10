package com.gmail.overjoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Input text and press enter");
		String text = sc.nextLine();
//		int t = countLetter(text, 'a');
//		System.out.println(t);
		printStatistic(text);
		
	}
	static int countLetter(String text, char letter) {
		int totalLetter = 0;
		char [] letters = text.toCharArray();
		for (char c : letters) {
			if (c == letter) {
				++totalLetter;
			}
		}
		return totalLetter;
	}
	static void printStatistic(String text){
		char [] letters = text.toCharArray();
		for (char c : letters) {
			System.out.println("Number of " + c + " in sting equals " + countLetter(text, c));
		}
	}
}
