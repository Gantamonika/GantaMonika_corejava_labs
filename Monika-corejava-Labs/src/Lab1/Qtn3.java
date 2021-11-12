package Lab1;

public class Qtn3 {
	public static void main(String[] args) {
		 int i=1;
		 int s=0;
		 int j=1;
		 int n = 9;
		   
				 
		 while(s<19)
		 {
			 s=i+j;
			 i=j;
			 j=s;
			 System.out.println(s);
		 }
		 
		 System.out.println(fib(n));
		 
		 }
			
	public static int fib(int n)
	    {
	    if (n <= 1)
	       return n;
	    return fib(n-1) + fib(n-2);
	    }
	      
	   
	   
	    

}