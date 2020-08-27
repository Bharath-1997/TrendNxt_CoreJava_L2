package Topic1;

import java.util.Scanner;  

public class Assignment4{  
 public static void main( String args[] ) throws MyOwnZeroValueEnteredException, MyOwnNegativeValueEnteredException{  
  
  Scanner scanner = new Scanner( System.in );  
  System.out.print("Enter rows number");
  int n=scanner.nextInt();
  try
  {
	  //1.using assertions
	/*  assert n>=0:"Assertion: Negative Not valid";  
	  assert n!=0:"Assertion: Zero is Not valid";
	*/ 
	  //2. with out using Assertions
	  if(check(n))
      {
    	  printDiamond(n);
      }     
  }
  catch (Exception ex)
  {
      System.out.println(ex.getMessage());
  } 
 }
	private static Boolean check(int n) throws MyOwnNegativeValueEnteredException, MyOwnZeroValueEnteredException
	{
		if(n<0)
		{
			throw new MyOwnNegativeValueEnteredException("No-Asserton:No Negative values allowed");
		}
		else if(n==0)
		{
			throw new MyOwnZeroValueEnteredException("NoAssertion:Zero is not allowed");
		}
		return true;
	}
	static void printDiamond(int n) 
    { 
        int space = n - 1; 
      
        // run loop (parent loop)  
        // till number of rows 
        for (int i = 0; i < n; i++) 
        { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            // Print i+1 stars 
            for (int j = 0; j <= i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space--; 
        } 
      
        // Repeat again in 
        // reverse order 
        space = 0; 
      
        // run loop (parent loop)  
        // till number of rows 
        for (int i = n; i > 0; i--) 
        { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            // Print i stars 
            for (int j = 0; j < i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space++; 
        } 
}
}