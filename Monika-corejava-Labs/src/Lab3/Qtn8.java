package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Qtn8 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a String : ");
		String s = sc.next();
		if (isAlphabaticOrder(s))
			System.out.println("True");
		else
			System.out.println("False");

	}

	static boolean isAlphabaticOrder(String s) {

		int n = s.length();

		char c[] = new char[n];

		for (int i = 0; i < n; i++) {
			c[i] = s.charAt(i);
		}

		Arrays.sort(c);
		for (int i = 0; i < n; i++)
			if (c[i] != s.charAt(i))
				return false;

		return true;
	}
}