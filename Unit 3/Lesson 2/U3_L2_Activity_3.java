import java.util.Scanner;

public class U3_L2_Activity_Three
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature?");
        double x = input.nextDouble();
        if (x < 97 || x > 99)
            System.out.println("NOT NORMAL");
  }
}