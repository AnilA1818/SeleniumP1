package package1;

import java.io.DataInputStream;
import java.io.IOException;

public class PalindromeNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 DataInputStream dis=new DataInputStream(System.in);
		 System.out.println("Enter number");
		 int num=Integer.parseInt(dis.readLine());
		 int rev,sum=0,temp;
		 temp=num;
		 while(num>0) {
			 rev=num%10;
			 sum=(sum*10)+rev;
			 num=num/10;
		 }
		 if(temp==sum) {
			 System.out.println("It is a palindrome");
		 }
		 else {
			 System.out.println("It is not a palindrome");
		 }
		 
	}

}
