class Calculator
{
    int a;

    public int add (int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}


public class object
{
    public static void main(String a[])
    {
        int num1 = 55;
        int num2 = 66;

        Calculator calcu = new Calculator(); 

        int result = calcu.add(num1,num2);
        System.out.println(result);
    }    
}
