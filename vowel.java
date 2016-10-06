import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String s1=s.toLowerCase();
	    StringBuilder b1=new StringBuilder();
	    StringBuilder b2=new StringBuilder();
	    for(int i=0;i<s1.length();i++)
	    {
	        char x=s1.charAt(i);
	        
	        if((x=='a')||(x=='e')||(x=='i')||(x=='o')||(x=='u'))
	        b1.append(x);
	        else
	        b2.append(x);
	       
	        
	        
	    }
	     System.out.println(b1+""+b2);
	    
	    
		}
}
