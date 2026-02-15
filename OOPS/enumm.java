enum Laptop
{
    macbook(2000), LOQ(60000), Nvidia, Asus(40000), Dell(50000);

    private Laptop() {
    }

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}



public class enumm {
    public static void main(String[] args) {
        
        // Laptop lap = Laptop.macbook;
        // System.out.println(lap);

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
