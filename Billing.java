package com.project.london;

import java.util.Scanner;

public class Billing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PLease Specify the item name");
		String item = sc.next();
		
		System.out.println("Please Enter the Quantity with measures");
		String quantity = sc.next();
		
		System.out.println("Please Enter the price");
		int price = sc.nextInt();
		
		
		System.out.println("          ------------------------------");
		System.out.println("                    TOTAL BILL          ");
		System.out.println("          ------------------------------");
		System.out.println("          item  --------------- " + item);
		System.out.println("          Quantity -------------" + quantity);
		System.out.println("          Price  ---------------" + price + "/-");
		

	}

}
