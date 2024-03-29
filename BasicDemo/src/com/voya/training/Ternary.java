package com.voya.training;

public class Ternary {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;
		
		String s= x>y && x>z?"x is greater":y>z?"y is greater":"z is greater";
		System.out.println(s);
		
		int xyz =(x>y && x>z)?x:(y>z)?y:z;
		System.out.println(xyz);
	}

}
