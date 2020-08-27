package Topic2;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 {

	public static void main(String[] args) {
		
		List<Number> list = new ArrayList<>();  //creating a list of type Number which accepts int,float & double
        list.add((int) 50);            //for int
        list.add((float) 33.333f);     //for float
        list.add((double)1.1);         //for double
        //list.add("string");                //it will not accept string
        for(Number v:list)  
        	  System.out.println(v);  
        	  
        	}

	}


