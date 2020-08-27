package Topic1;

public class Assignment1 
{
    static int count=0;
    Assignment1()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Assignment1 obj1 = new Assignment1();
        Assignment1 obj2 = new Assignment1();
        Assignment1 obj3 = new Assignment1();
        Assignment1 obj4 = new Assignment1();
        System.out.println("Number of objects created:"+count);
    }
}