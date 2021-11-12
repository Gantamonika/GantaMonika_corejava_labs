package Lab1;

public class Qtn6 {
	public static void main(String[] args) {
		System.out.println(calculateDifference(2));

	}
	public static int calculateDifference(int n)
	{
		int sumOfSquares=0;
		int squareOfSum=0;
		for(int i=1;i<=n;i++)
		{
			squareOfSum+=i;
			sumOfSquares+=(int) Math.pow(i, 2);
		}
		squareOfSum=(int)Math.pow(squareOfSum, 2);
		int diff=sumOfSquares-squareOfSum;
		return diff;
	}


}