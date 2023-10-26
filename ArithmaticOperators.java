package com.project.london;

public class ArithmaticOperators {
	public static void main(String[] args) {
		int x = 15;
		int y = 5;
		int z = 3;

		System.out.println(x + y * z);
		System.out.println(x / y);
		System.out.println(x % y);
		System.out.println(x + z % y);
		System.out.println((x + z) % y);
		System.out.println(x + (z % y));
	}
}
