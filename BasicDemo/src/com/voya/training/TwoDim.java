package com.voya.training;

public class TwoDim {

	public static void main(String[] args) {
		int[][] marks= new int[3][4];
		System.out.println(marks[0][0]);
		System.out.println(marks.length);
		
		marks[0][0]=8;
		marks[0][1]=80;
		marks[0][2]=800;
		marks[0][3]=8000;
		marks[1][0]=7;
		marks[1][1]=70;
		marks[1][2]=700;
		marks[1][3]=7000;
		marks[2][0]=6;
		marks[2][1]=60;
		marks[2][2]=600;
		marks[2][3]=6000;
		
		//for loop
		System.out.println("Using for loop");
		for (int i=0;i<marks.length;i++) {
		for (int j=0;j<marks[i].length;j++) {
			System.out.println(marks[i][j]);
		}
		}
		System.out.println();
		//foreach loop
		System.out.println("Using foreach loop");
		for(int[] one:marks) {
			for(int num:one) {
				System.out.println(num);
			}
		}

	}

}
