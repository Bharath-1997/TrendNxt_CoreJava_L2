package Topic1;

public class Assignment2_1 { 
    public static void main(String[] args) 
    { 
        //Assignment2_1 obj1=new Assignment2_1();
         
        //obj1=null;
        // Requesting JVM to call Garbage Collector method 
        System.gc(); 
        System.out.println("Main Completes"); 
    } 
  
    // Here overriding finalize method 
    @Override
    public void finalize() 
    { 
        System.out.println("finalize method called"); 
    } 
} 
