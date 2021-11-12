package Lab3;

import java.util.Scanner;

public class Qtn4 {

	public static void main(String[] args) {
		int num = 0;
		System.out.println(Qtn4.modifyNumber(num));
		
	}

	public static int modifyNumber(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int num1 = sc.nextInt();
		int min = 9, max = 0, digit, diff;
		while (num1 > 0) {
			digit = num1 % 10;
			num1 = num1 / 10;
		}
		diff = max - min;
		System.out.println("Diff b/w consecutive numbers  Digit : " + diff);
		return num1;
		
	}

}