class Calc 
{
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
}

class AdvCalc extends Calc //in this the method overide
{
    public int add(int n1 , int n2)
    {
        return n1 + n2 + 5;
    }
}

public class overiding 
{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5,6);
        System.out.println(r1);
    }
}