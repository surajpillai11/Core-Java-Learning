class A
{
    public A()
    {
        System.out.println("Object Created");
    }

    public void show()
    {
        System.out.println("In a show");
    }
}

public class anonymous 
{
    public static void main(String[] args) 
    {
        new A().show();// This is called anonoymous object
    }
}