import java.util.Scanner;
import testing.Math;

public class U2_L8_Activity_One
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = input.nextInt();

        double ran1 = Math.random();
        double ran2 = Math.random();
        double ran3 = Math.random();

        double a = (int)(ran1 * (n+1)) + 2;
        double b = (int)(ran2 * (n+1)) + 2;
        double c = (int)(ran3 * (n+1)) + 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
  }
}
