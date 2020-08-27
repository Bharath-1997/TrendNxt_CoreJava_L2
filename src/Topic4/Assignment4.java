package Topic4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment4 {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(99,98,97,100,92,84,80,89,90);
		System.out.println(marks);
		DecimalFormat df = new DecimalFormat("0.00");
	    System.out.println("Average of all marks="+df.format(calculateAvg(marks)));	
	}

	private static double calculateAvg(List<Integer> marks) 
	{
		
		return marks.stream().mapToInt(val -> val).average().orElse(0.0);
	}

}
