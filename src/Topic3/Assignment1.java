package Topic3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment1 {
 
	
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Bharath\\product.txt");
		if(!f.exists()){
		  f.createNewFile();
		  PrintWriter pw = new PrintWriter(f);
			pw.println("ID  Cost Items");
			pw.println("==============");
			pw.close();
		}else{
		  System.out.println("File already exists");
		}
//		File file = new File("D:\\Bharath\\product.txt");
//		file.createNewFile();
		
		boolean start=true;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Add new product");
			System.out.println("2. Display the total Items");
			System.out.println("3. Display the total cost");
			System.out.println("4. Exit");
			display();
			System.out.println("enter your choice below   :");
			
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				add();
				break;
			case 2:
				display();
				break;
			case 3:
				displaycost();
			case 4:
				start=false;
			}
		}
		while(start);
		

	}

	private static void displaycost() throws IOException {
		
		BufferedReader r = new BufferedReader( new FileReader("D:\\Bharath\\product.txt") );
		String s = "", line = null;
		int total=0;
		r.readLine();r.readLine();
		String[] str;
		while ((line = r.readLine()) != null) {
			str=line.split("\\s+");
			total+=Integer.parseInt(str[1])*Integer.parseInt(str[2]);
		}
		r.close();
		display();
		System.out.println("Total cost="+total);
	}

	private static void display() throws IOException {
		BufferedReader r = new BufferedReader( new FileReader("D:\\Bharath\\product.txt") );
		String s = "", line = null;
		while ((line = r.readLine()) != null) {
			System.out.println(line);
		}
		r.close();
	}

	private static void add() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details below");
		System.out.println("enter the Product id");
		int pid=sc.nextInt();
		System.out.println("enter the Product cost");
		int cost=sc.nextInt();
		System.out.println("enter the no.of Items");
		int items=sc.nextInt();
		FileWriter fw = new FileWriter("D:\\Bharath\\product.txt",true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    @SuppressWarnings("resource")
				PrintWriter out = new PrintWriter(bw);
			    out.println(pid+" "+cost+"   "+items);
		        out.close();
	}


}
