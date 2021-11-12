package Lab1;

public class Qtn7 {
	public static void main(String[] args) {
		System.out.println(checkNumber(10));
	}
		public static boolean checkNumber(int num)
		{
			boolean flag=false;
			int currentDigit=num%10;
			num=num/10;
			while(num>0)
			{
				if(currentDigit<=num%10)
				{
					flag=true;
					break;
					
				}
				currentDigit=num%10;
				num=num/10;
			}
			if(flag)
				return false;
			else return true;
		}

}