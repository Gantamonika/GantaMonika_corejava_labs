package Lab1;

import java.util.Scanner;

public class Qtn4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for (int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
			//	System.out.print("prime numbers upto "+ n+ " are: ");
				System.out.println(i);
			}
		}
	}

}