package com.training.basic;

public class Smaller {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 3, 4, 2 };
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Smallest of an array is: " + min);

	}

}
