import java.io.*;
public class Factorial {

	public static void main(String[] args)throws IOException {
		int num,temp=1;
		BufferedReader g=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		num=Integer.parseInt(g.readLine());
		while(num!=0)
		{
			temp=temp*num;
			num=num-1;
		}
		
		System.out.println(temp);

	}

}
