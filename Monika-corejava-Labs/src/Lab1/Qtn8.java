package Lab1;

public class Qtn8 {
	public static void main(String[] args) {
		System.out.println(checkNumber(10));
	}
	public static boolean checkNumber(int n) {
		  if(n==0)
			  return false;
		  while (n!=1)
		  {
			  n=n/2;
			  if(n%2!=0 && n!=1)
			  {
				  return false;
				  
			  }}
			  return true;
		  }

}