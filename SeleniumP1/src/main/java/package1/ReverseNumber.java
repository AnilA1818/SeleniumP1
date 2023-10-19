package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {

	public static void main(String[] args) throws NumberFormatException, IOException   {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter nuber");
		 int num=Integer.parseInt(br.readLine());
		 int revNum=0;
		 System.out.println("Before reverse:"+num);
		 while(num!=0) {
			 int reminder=num%10;
			 revNum=revNum*10+reminder;
			 num=num/10;
			 //System.out.println(num);
			 //System.out.println(revNum);
			  
		 }
		  
		 System.out.println("Reverse of given num:"+revNum);

	}

}
