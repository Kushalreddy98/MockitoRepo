package com.voya.training;

public class OneDim {

	public static void main(String[] args) {
		int[] marks =new int[4];
		System.out.println(marks[0]);
		System.out.println(marks.length);
		
		marks[0]=90;
		marks[1]=80;
		marks[2]=70;
		marks[3]=60;
		//marks[4]=90;
		
		//for loop
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println();
		//foreach loop
		for(int mark:marks) {
			System.out.println(mark);
		}
	}

}
