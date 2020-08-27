package Topic4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {

	public static void main(String[] args) {
		
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("testing");//Adding object in arraylist    
	      list.add("Apple");
	      list.add("");
	      list.add("bharath");  
	      list.add("");
	      list.add("raju");
	      long count=list.stream().filter(string -> string.length()>5).count();
	      long countempty=list.stream().filter(string -> string.isEmpty()).count();
	      List<String> filtered = list.stream().filter(string -> string.isEmpty()).collect(Collectors.toList());
	      System.out.println("Total no.of string whose lengh grater than five="+count);
	      System.out.println("Total no.of empty strings="+countempty);
	      System.out.println(filtered);
	 }  
	}

