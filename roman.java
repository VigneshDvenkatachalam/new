import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    int number;
    Scanner sc=new Scanner(System.in);
    number=sc.nextInt();
    StringBuilder br=new StringBuilder("");
    OUTER:
    while(number!=0)
    {
        if(number>=1000)
        {
            br.append("M");
            number-=1000;  
            continue OUTER;
        }
        if(number>=900)
        {
            br.append("CM");
            number-=900;
            continue OUTER;
        }
        if(number>=500)
        {
            br.append("D");
            number-=500;   
            continue OUTER;
        }
        if(number>=400)
        {
            br.append("CD");
            number-=400;   
            continue OUTER;
        }
        if(number>=100)
        {
            br.append("C");
            number-=100;   
            continue OUTER;
        }
        if(number>=90)
        {
            br.append("XC");
            number-=90; 
            continue OUTER;
        }
        if(number>=50)
        {
            br.append("L");
            number-=50; 
            continue OUTER;
        }
        if(number>=40)
        {
            br.append("XL");
            number-=40; 
            continue OUTER;
        }
        if(number>=10)
        {
            br.append("X");
            number-=10; 
            continue OUTER;
        }
        if(number>=9)
        {
            br.append("IX");
            number-=9;  
            continue OUTER;
        }
        if(number>=5)
        {
            br.append("V");
            number-=5;  
            continue OUTER;
        }
        if(number>=4)
        {
            br.append("IV");
            number-=4;  
            continue OUTER;
        }
        if(number>=1)
        {
            br.append("I");
            number-=1;  
            continue OUTER;
        }
    }
   System.out.println(br);
}
	
}