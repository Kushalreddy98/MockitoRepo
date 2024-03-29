package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int[] numbers= {10,2,3,4,5};
		int max=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println("greatest of an array is: "+max);

	}

}
