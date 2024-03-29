package com.training.basic;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		int sum = 0;
		int avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values into the array: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();

		}
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}

		avg = sum / numbers.length;
		System.out.println("sum of an array is: " + sum);
		System.out.println("Average of an array is:" + avg);
		sc.close();
	}

}
