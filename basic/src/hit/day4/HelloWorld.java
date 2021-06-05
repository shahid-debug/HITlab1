package hit.day4;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to Java....");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Name:");
		String name=scan.next();
		System.out.println("Welcome to...."+ name);
	}

}
