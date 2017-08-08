package util;

import java.util.Scanner;

public class Input {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static String readString() throws java.io.IOException {
		return scanner.next();
	}

	public static String readLine() throws java.io.IOException {
		return scanner.nextLine();
	}
	public static int readInt() throws java.io.IOException {	
		return scanner.nextInt();
	}

	public static void main(String[] args) {
		try {
			System.out.print(" chaine : ? ");
			String chaineLue = Input.readString();
			System.out.println("lue  => " + chaineLue);
			System.out.print(" int : ? ");
			int intLu = Input.readInt();
			System.out.println("lue  => " + intLu);
		} catch (java.io.IOException e) {
		}
	}
}// Input
