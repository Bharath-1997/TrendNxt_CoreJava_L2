package Topic4;

import java.util.Scanner;

public class Assignment1{

	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the text: ");
String text=sc.nextLine();
System.out.println("Enter the character you want to search:");
char ch = sc. next(). charAt(0);
Assignment1_interface_implementation obj=new Assignment1_interface_implementation();
int count=obj.findOccurence(text, ch);
System.out.println("The no.of occurrences of "+ch+" is="+count);
	}

}
