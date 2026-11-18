import java.util.Scanner;
public class java_5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double height, base;
        System.out.print("Enter Height = ");
        height = sc.nextDouble();

        System.out.print("Enter base = ");
        base = sc.nextDouble();

        double ans = 0.5 * height * base;

        System.out.println("Ans = " + ans);

    }
    
}
