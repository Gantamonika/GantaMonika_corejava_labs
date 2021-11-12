package Lab1;

public class Qtn1 {


		public static void main(String[] args) {
			
			Qtn1 obj= new Qtn1();
			obj.cube(123);
			//System.out.println("d");
		}


	public void cube(int n)
	{
		int c=0;
		if(n!=0)
		{
			int r=n%10;
			c= c+(r*r*r);
			n=n/10;
		}
		
		System.out.println("Cube of the digits is "+ c);
	}}