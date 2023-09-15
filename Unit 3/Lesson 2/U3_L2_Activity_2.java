import java.util.Scanner;

public class U3_L2_Activity_Two
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        if (x < y)
            System.out.println("Smallest is: " + x);
        if (y < x)
            System.out.println("Smallest is: " + y);
        if (x == y)
            System.out.println(x);
  }
}