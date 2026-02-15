//Functional interface


@FunctionalInterface
interface A 
{
    void show();
}

    
public class interr {
    public static void main(String[] args) {
        A obj = new A(){
            public void show()
            {
                System.out.println("In the show");
            }
        };
        obj.show();
    }
}
