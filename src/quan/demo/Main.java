package quan.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter dicimal number to convert: ");
		int decimal = scanner.nextInt();
		System.out.println("Binary of " + decimal + " is: " + Integer.toBinaryString(decimal));
		System.out.println("Hexadecimal of " + decimal + " is " + Integer.toHexString(decimal));
		
		System.out.println("Enter binary to convert to int: ");
		String binary = scanner.next();
		System.out.println("Decimal of " + binary + " is : " + Integer.parseInt(binary, 2));
		
		System.out.println("Enter Hexadecimal to convert Decimal: ");
		String string = scanner.next();
		System.out.println(Integer.parseInt(string,16));
		
		

	}

}
