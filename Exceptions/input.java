import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        System.out.println("Enter the Number");
        
        // InputStreamReader in  = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

    }
    
}
