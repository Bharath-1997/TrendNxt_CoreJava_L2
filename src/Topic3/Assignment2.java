package Topic3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment2 {

	public static void main(String[] args) throws Exception {
		File f = new File("D:\\Bharath\\Numbers.txt");
		if(!f.exists()){
		  f.createNewFile();
		  PrintWriter pw = new PrintWriter(f);
		  int max=30,min=1;
		  for(int i=1;i<=30;i++)
		  {
			  int random_int = (int)(Math.random() * (max - min + 1) + min);
			  pw.println(random_int);
		  }
		  pw.close();
		  }else{
		  System.out.println("----File already exists----");
		     }
		System.out.println("----Below are the numbers randomly generated----");
		BufferedReader r = new BufferedReader( new FileReader("D:\\Bharath\\Numbers.txt") );
		String s = "", line = null;int i=0;
		int sum=0;
		while ((line = r.readLine()) != null) {
			i++;
			System.out.print(line+" ");
			sum+=Integer.parseInt(line);
			if(i%10==0)
			{
				System.out.println("\n"+"sum is="+sum);
				System.out.println("Average is="+sum/10+"\n");
				sum=0;
			}
		}
		
	}

}
