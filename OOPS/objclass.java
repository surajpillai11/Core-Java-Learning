class Laptop
{
    String model;
    int price;

    public String toString() 
    {
        return model + " : " + price;
    }

    public boolean equals(Laptop that)
    {
        if(this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
    }
}


public class objclass {
    public static void main(String a[])
    {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Loq";
        obj1.price = 10000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Loq";
        obj2.price = 10000;
        
        boolean result = obj1.equals(obj2);

        System.out.println(result);
    }
}
