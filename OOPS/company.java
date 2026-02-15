interface Computer
{
    void code();

}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("compile, code, run ");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("compile, code, run :: Faster ");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}


public class company {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer suraj = new Developer();
        Developer akshu = new Developer();
        suraj.devApp(lap); 
        akshu.devApp(desk); 
    }
}
