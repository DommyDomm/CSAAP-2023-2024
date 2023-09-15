import java.util.Scanner;

public class U3_L4_Activity_Two
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = input.nextInt();
    int b = input.nextInt();

    if (a >= 0 && b >= 0) {
        if (a % 2 == 0 && b % 2 == 0)
            System.out.println("Both are positive and even.");
        else
          System.out.println("At least one is negative or odd.");
    }
    else
        System.out.println("At least one is negative or odd.");
  }
}