package Topic4;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		Assignment2_implementation obj=new Assignment2_implementation();
		System.out.println("Total words="+obj.count(str));
		
	}

}
