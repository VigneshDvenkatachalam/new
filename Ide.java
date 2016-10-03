import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
     int arr[][]= new int[2][5];
     Scanner scan = new Scanner(System.in);

     for(int i =0;i<2;i++){
         for(int j=0;j<4;j++){
             arr[i][j] = scan.nextInt();

         }
     }
      System.out.print("\t");
     for(int k=0;k<4;k++)
     {
      System.out.print("\t"+"\t"+"Product");
      System.out.print("\t"+k);
     }
      System.out.print("\t\t"+"total");
      int t=0;
      for(int i =0;i<2;i++){
          int temp=0;
          System.out.println("");
           System.out.print("SalesPerson #"+i+"\t");
         for(int j=0;j<4;j++){
             temp=temp+arr[i][j];
             System.out.print("\t"+arr[i][j]+"\t"+"\t"+"\t");

         }
        
         t=t+temp;
         System.out.println(temp);
     
     }
     System.out.print("Total:");
         for(int j=0;j<4;j++)
         {
          int temp=0;
          for(int i =0;i<2;i++)
         {
             temp=temp+arr[i][j];

         }
         System.out.print("\t"+"\t"+"\t"+"\t"+temp);
     }
      System.out.print("\t"+"\t"+"\t"+t);
      
       System.out.println("");
       System.out.print("\t"+"\t"+"\t"+"Max"+"\t"+"SalesPerson");
       System.out.println("");
       for(int j=0;j<4;j++)
         {
          int largest=arr[0][0];
          int t2=0;
          for(int i =0;i<2;i++)
         {
           if(arr[i][j] > largest)
           {
             largest = arr[i][j];
             t2=i;
           }

         }
         System.out.print("Product"+" #"+j+"\t");
         System.out.print(largest+"\t"+"#"+t2);
         System.out.println("");
         }
     
}

	
}
