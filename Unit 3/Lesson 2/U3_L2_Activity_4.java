import java.util.Scanner;

public class U3_L2_Activity_Four
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two test scores: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        
        if (a > 100 || a < 0)
            System.out.println("Not Valid");
        if (b > 100 || b < 0)
            System.out.println("Not Valid");
  }
}