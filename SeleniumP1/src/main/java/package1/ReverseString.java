package package1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("Enter name");
		 String name=scn.nextLine();
		 String revString="";
		 System.out.println(name);
		 for(int i=0;i<name.length();i++) {
			 revString=name.charAt(i)+revString;
			// System.out.println(revString);
		 }
		 System.out.println(revString);
		 
	}

}
