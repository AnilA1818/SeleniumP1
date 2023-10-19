package package1;

import java.io.DataInputStream;
import java.io.IOException;

public class SwappingNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 DataInputStream dis=new DataInputStream(System.in);
		 System.out.println("Enter numbers");
		 int num1=Integer.parseInt(dis.readLine());
		 int num2=Integer.parseInt(dis.readLine());
		 System.out.println("Before Swapping:"+num1+" "+num2);
		 int num3=num1;
		 num1=num2;
		 num2=num3;
		 System.out.println("After Swapping:"+num1+" "+num2);
		 

	}

}
