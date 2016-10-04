/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();

	String s2=s1;
	for(int i=0;i<s1.length();i++)
	{
	    StringBuilder br1=new StringBuilder();
	    StringBuilder br2=new StringBuilder();
	    for(int j=0;j<s2.length();j++)
	    {
	        if((s1.charAt(i))==(s2.charAt(j)))
	        {
	            System.out.println(s1.charAt(i));
	           
	            for(int k=0;k<s2.length();k++)
	            {
	                if((s1.charAt(i))!=(s2.charAt(k)))
	                {
	                    br1.append(s2.charAt(k));
	                   
	                }
	                
	            }
	            if((i==0)||(i==(s2.length()-1)))
	            {
	                br1.append(s1.charAt(i));
	                System.out.println(br1);
	                System.out.println(br1.reverse());
	            }
	            else
	            {
	                 br2.append(s1.charAt(i)+""+br1);
	                 System.out.println(br2);
	                 System.out.println(br2.reverse());
	            }
	              
	        }
	        else
	        {
	            System.out.println(s1.charAt(i)+""+s1.charAt(j));
	        }
	        
	    }
	    
	}
}
}
