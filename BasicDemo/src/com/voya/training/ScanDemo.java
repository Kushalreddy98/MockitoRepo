package com.voya.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		String name=sc.nextLine();
		int id=sc.nextInt();
		sc.nextLine();
		String city=sc.nextLine();
		double sal=sc.nextDouble();
		
		System.out.println("name is: "+name);
		System.out.println("id is: "+id);
		System.out.println("city: "+city);
		System.out.println("salary: "+sal);
		
		
		sc.close();

	}

}
