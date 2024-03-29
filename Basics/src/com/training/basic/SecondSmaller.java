package com.training.basic;

public class SecondSmaller {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 4, 2 };
		int min = numbers[0];
		int min1 = numbers[1];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Smallest of an array is: " + min);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min1 && min != numbers[i]) {
				min1 = numbers[i];
			}
		}
		System.out.println("2nd Smallest of an array is: " + min1);
	}

}
