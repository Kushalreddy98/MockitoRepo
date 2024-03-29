package com.training.basic;

import java.util.Scanner;

public class SquareOneDim {

	public static void main(String[] args) {
		int[] numbers= new int[5];
		int[] squares=new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values into the array: ");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
			
		}
		for(int i=0;i<numbers.length;i++) {
			squares[i]=numbers[i]*numbers[i];
			}
		System.out.println("The square of those numbers are: ");
			for(int output:squares) {
				System.out.println(output);
			}
	sc.close();
}}
