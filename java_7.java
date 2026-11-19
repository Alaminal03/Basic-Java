import java.util.Scanner;
public class java_7 {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value = ");
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.print("Zero"); 
                break;

             case 1:
                System.out.print("One"); 
                break;
             
             case 2:
                System.out.print("Two"); 
                break;
                
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
