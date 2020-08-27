package Topic3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Bharath\\input.txt");
		 PrintWriter pw = new PrintWriter(f);
			pw.println("testing     space in      file");
			pw.println("with   extra     line     ");
			pw.close();
		    BufferedReader br = new BufferedReader(new FileReader("D:\\Bharath\\input.txt")); 
		            FileWriter fw = new FileWriter("D:\\Bharath\\output.txt");
		        String st;
		        while((st = br.readLine()) != null){
		            fw.write(st.replaceAll("\\s+", " ").trim().concat("\n"));
		    
		        }
		  fw.close();
		  br.close();
		  //reading the generated file data after removing extra spaces
		  BufferedReader brout = new BufferedReader(new FileReader("D:\\Bharath\\output.txt"));
		  String res;
		  while((res=brout.readLine())!=null)
		  {
			  System.out.println(res);
		  }
		  
	}

}
