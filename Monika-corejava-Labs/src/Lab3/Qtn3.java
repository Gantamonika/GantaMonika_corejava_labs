package Lab3;

import java.util.Scanner;

public class Qtn3 {
	
	 public static void main(String[] ar)
     {
    	 Scanner s = new Scanner(System.in);
    	 Qtn3 p = new Qtn3();
         System.out.println("Enter a string");
         String string = s.next();
         System.out.println(p.alterString(string));
         s.close();
     }

	 public String alterString(String str)
     {
            StringBuffer sbr = new StringBuffer(str);
            for(int i=0;i<str.length();i++)
            {
                   char c = sbr.charAt(i);
                   if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
                   {
                         sbr.replace(i,i+1,String.valueOf((char)(c+1)));
                   }
            }
            return sbr.toString();
     }
    
}