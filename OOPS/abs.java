abstract class Car 
{
    abstract public void drive();
    abstract public void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class Wagnor extends Car
{
    public void drive() {
        System.out.println("Driving....");
    }

    
}

class UpdatedWagnor extends Wagnor
{
    public void fly() {
        System.out.println("Flying....");
    }
}




public class abs {
    public static void main(String[] args) {
        Car obj = new UpdatedWagnor();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
