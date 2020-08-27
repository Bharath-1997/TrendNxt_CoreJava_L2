package Topic2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		//File file = new File("D:\\Bharath\\music.txt");
		boolean result=true;
		 //result = file.createNewFile();
		 String path="D:\\Bharath\\music.txt";
		if(result)
		{
			writetofile(path);
			readfromfile(path);
			
		}
	}
	private static void writetofile(String file) {
		try(FileWriter fileWriter = new FileWriter(file)) {
		    String text = "This is a sample text.\n";                //text
		    Date date=new Date(); 
		    String dateobject=date.toString();                      //dateobject
		    double b = 55.05;
		    String bb = "45";
	        @SuppressWarnings("deprecation")
			Double x = new Double(b);
	        @SuppressWarnings("deprecation")
			Double y = new Double(bb);
	        String doublesx="bytevalue(x) = "+ x.byteValue()+"\n";   //double object
	        String doublesy="bytevalue(y) = "+ y.byteValue()+"\n";
	        
		    fileWriter.write(text+"\n"+dateobject+"\n"+doublesx+doublesy);
		    fileWriter.close();
		} catch (IOException e) {
		    System.out.println(e.getMessage());
		}
		
	}

	private static void readfromfile(String file) throws Exception {
		
		BufferedReader r = new BufferedReader( new FileReader(file) );
		String s = "", line = null;
		while ((line = r.readLine()) != null) {
			System.out.println(line);
		}
		
	}
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  }
