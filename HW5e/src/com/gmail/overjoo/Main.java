package com.gmail.overjoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Call, me baby one more time.";
				System.out.println(wordsInString(str));
	}
		static int wordsInString(String str) {
			String [] splittedstr = str.split(" ");
			return splittedstr.length;
		}
}
