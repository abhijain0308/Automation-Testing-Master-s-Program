package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x = s.nextInt();

		System.out.println("Enter the value of y:");
		y = s.nextInt();
		s.nextLine();
		if (x == y) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}

		// get two strings from user and try comparing it

		String name1;
		String name2;

		System.out.println("Enter the value of name1:");
		name1 = s.nextLine();

		System.out.println("Enter the value of name2:");
		name2 = s.nextLine();

		// case sensitive
		if (name1.equals(name2)) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}

		// case insensitive
		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}
		
		

	}

}
