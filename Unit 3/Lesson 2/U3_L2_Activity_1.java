import java.util.Scanner;

public class U3_L2_Activity_One
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter five numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        
        double all = a+b+c+d+e;
        double avg = all / 5;
        if (avg >= 89.95)
            System.out.println("ABOVE AVERAGE");
  }
}