class Human 
{
    private int age;
    private String name;

    public Human() //default constructor
    {
        age = 12;
        name = "Surajj";

    }

    public Human(int age , String name) //parameteriezed constructor
    {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class construct
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        Human obj1 = new Human(18, "ALOK");
        // Human obj2 = new Human();

        // obj.setAge(44);
        // obj.setName("Suraj");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }
}
