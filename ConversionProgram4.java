package com.project.london;

public class ConversionProgram4 {
	public static void main(String[] args) {
		int NumberOfDays = 38 ;
		int weeks = NumberOfDays / 7 ;
		int remainder = NumberOfDays % weeks ;
		
		System.out.println(NumberOfDays + " days = " + weeks +" weeks + extra " + remainder + " days");
	}
}
