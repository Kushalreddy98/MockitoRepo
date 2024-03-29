package com.voya.training;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[] usernames = { "Kushal", "Manju", "Hemanth", "Basava" };
		Scanner sc = new Scanner(System.in);
		boolean isPresent = false;
		System.out.println("Enter the name: ");
		String uname = sc.next();
		for (String username : usernames) {
			if (username.equals(uname)) {
				System.out.println("Name is exist");
				isPresent = true;
				break;
			}
		}
		if (!isPresent) {
			System.out.println("you are Registered ");

		}

		sc.close();
	}
}
