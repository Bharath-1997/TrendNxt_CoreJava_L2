package Topic1;

import java.util.Scanner;

public class Assignment3 {
		   public enum Days {
		      Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
		   }
		   public static void main(String[] args) {
			   Scanner sc=new Scanner(System.in);
			   System.out.println("enter the day:");
			   int d=sc.nextInt();
			   printday(d);
		        //enum takes index from 0
		        // Monday=0    Tuesday=1 ........Sunday=6
		      
		   }
		   static void printday(int d)
		   {
			   System.out.println("Day is = " + Days.values()[d]);
		   }
		}
