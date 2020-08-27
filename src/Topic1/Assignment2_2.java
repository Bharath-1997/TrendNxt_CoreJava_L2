package Topic1;

public class Assignment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment2_1 obj1=new Assignment2_1();
		obj1=new Assignment2_1();
		obj1=new Assignment2_1();
		obj1=new Assignment2_1();
		 Runtime.getRuntime().gc();// the finalize method will called for 3 times
		
	}

}
