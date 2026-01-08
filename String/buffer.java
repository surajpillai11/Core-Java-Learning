//Java is immutual if you want to change the string 
//We can use in Java String Buffer and String Builder


public class buffer 
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Suraj");
        sb.append(" Pillai");

        sb.insert(0, "Helloo ");//can use various operation insert delete sub string and more

        System.out.println(sb);
        System.out.println(sb.capacity());//buffer give 16bytes of extra capacity 
        System.out.println(sb.length());

    }
}