package com.training.basic;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String[] usernames = { "Raju", "Krushi", "Malli" };
		Scanner sc = new Scanner(System.in);
		boolean isPresent = false;
		System.out.println("Enter username to login: ");
		String uname = sc.next();
		for (String username : usernames) {
			if (username.equals(uname)) {
				System.out.println("You are logged in succesfully");
				isPresent = true;
				break;
			}
		}
		if (!isPresent) {
			System.out.println("Invalid username");
		}

		sc.close();
	}

}
