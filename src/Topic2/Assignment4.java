package Topic2;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		
		
	     Set<Currency> currencySet =  Currency.getAvailableCurrencies();  
	     System.out.println("Available currencies are:");  
	     for(Currency c:currencySet){  
		     System.out.println("Name is="+c.getDisplayName()+"   "+"currencycode="+c.getCurrencyCode()+"   "+"symbol is="+c.getSymbol());
	     }
	    System.out.println("\n Enter the currencyCode");
	     Scanner sc=new Scanner(System.in);
	     String ccode=sc.nextLine();
	      Currency cur1 = Currency.getInstance(ccode);
	      System.out.println("Currency symbol is = " + cur1.getSymbol());

	}

}
