//Static Variable uses A static variable in Java is a variable that belongs to the class itself,
// not to any specific object of the class. It is created only once and shared by all objects of that class.


class Mobile
{
    static String name;
    int price;
    String brand;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}


public class sstatic
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
    }
}