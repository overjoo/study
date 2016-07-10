package com.gmail.overjoo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		Date date = new Date();
		SimpleDateFormat sdfIn = new SimpleDateFormat("dd:MM:yyyy");
		String text;
		System.out.println("Input date dd:MM:yyyy and press Enter");
		text = sc.nextLine();
		try {
			date = sdfIn.parse(text);
		}
		catch(ParseException e) {
			System.out.println(e);
		}
		SimpleDateFormat sdfOut = new SimpleDateFormat("dd MMMM yyyy");
		
		String textOut = sdfOut.format(date);
		System.out.println(textOut);
		System.out.println(date.getTime());
		sc.close();
	}

}
