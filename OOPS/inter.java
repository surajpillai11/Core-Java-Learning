interface A 
{
    int age = 55;
    String area = "PUNE";

    void show();
    void config();

}

class B implements A 
{
    public void show()
    {
        System.out.println("In show Class");
    }

    public void config()
    {
        System.out.println("In Config Class");
    }


}

public class inter {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area);


        
    }
    
}
