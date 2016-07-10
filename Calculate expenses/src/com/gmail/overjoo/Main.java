package com.gmail.overjoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 Программа считает, сколько должно остаться денег на определенный день месяца
 (который вводится с клавиатуры в формате целого числа)
 Так же, подсказывает сколько можно тратить в месяц и в день.
 В программе нужно обновить зарплату за месяц, количество дней в месяце
 и сколько хотите сберечь с этой зарплаты
 */
public class Main {

	public static void main(String[] args) throws IOException {
		
		
		// обновить данные в строке ниже
		int monthSal = 35070, monthDay = 31, savings = 10000; 
		int expenses = monthSal - savings;
		int expensesPerDay = expenses / monthDay;
		System.out.println("Какое сегодня число? (в формате целого числа)");
		
		BufferedReader bure = new BufferedReader(new InputStreamReader(System.in));
		String todayS = bure.readLine();
		int todayI = Integer.parseInt(todayS);
		
			if (todayI > monthDay || todayI < 1) {
			System.out.println("Боря, ти не то робиш");
			System.exit(0);
			}
		
		double moneyleft = monthSal- expensesPerDay * todayI;
		System.out.println("Сейчас на карте должно быть не меньше " + moneyleft);
		System.out.println("В день трать не больше " + expensesPerDay);
		System.out.println("В неделю трать не больше " + expensesPerDay * 7 );

		
			
		}
		
				
	}


