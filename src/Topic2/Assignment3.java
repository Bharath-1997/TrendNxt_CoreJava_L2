package Topic2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Assignment3 {

	public static void main(String[] args) {
		
		LocalDate bday = LocalDate.of(1996, Month.DECEMBER, 11);   //from date
        LocalDate today = LocalDate.now();          			   //to date
        
        Period age = Period.between(bday, today);        //it will fetch difference between two dates
        int years = age.getYears();
        int months = age.getMonths();
        
        System.out.println("number of years: " + years);
        System.out.println("number of months: " + months);
		
	}

}
