package com.gmail.overjoo;

public class Main {
	
	public static void main(String[] args) {
		// mirror one dimension array
		int[] a = { 7, 2, 9, 4 };
		if (a.length % 2 == 0) {
			int i = a.length/2;
			int j = (a.length/2 - 1);
			while (i < a.length && j > -1) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
		}
		}
			if (a.length % 2 != 0) {
				int i = a.length/2 + 1;
				int j = (a.length/2 - 1);
				while (i < a.length && j > -1) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
					i++;
					j--;
			}
			}
			for (int z : a) {
				System.out.print(z + " ");
			}
			
		

	}}





