package com.training.basic;

public class SecondGreater {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 4, 2 };
		int max = numbers[0];
		int max1 = numbers[1];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Greatest of an array is: " + max);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max1 && max != numbers[i]) {
				max1 = numbers[i];
			}
		}
		System.out.println("2nd Greatest of an array is: " + max1);
	}

}
