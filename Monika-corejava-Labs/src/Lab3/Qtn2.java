package Lab3;

import java.util.Scanner;

public class Qtn2 {

	public String getImage(String str) {
		StringBuffer sbr = new StringBuffer(str);
		sbr.append('|');
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
	}

	public static void main(String[] ar) {
		Qtn2 obj = new Qtn2();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.next();
		System.out.println(obj.getImage(str));
		s.close();
	}
}