//Static method



class Mobile
{
    static String name;
    int price;
    String brand;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}



public class method
{
    public static void main (String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1200;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 12500;
        Mobile.name = "Smartphone";

        Mobile obj3 = new Mobile();
        obj3.brand = "Nothing";
        obj3.price = 500;
        Mobile.name = "Smartphone";

        obj1.show();
        obj2.show();
        obj3.show();


        Mobile.show1(obj1);

    }
}