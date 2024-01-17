package scool;

import java.util.Scanner;

public class sub2nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("The first number is:");
		int a = scan.nextInt();
		
		System.out.println("The second number is:");
		int b = scan.nextInt();
		
		int difference = a - b;
		System.out.println("The difference is "+difference);

	}

}
