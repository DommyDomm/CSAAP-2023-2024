import java.util.Scanner;

public class U3_L4_Activity_One
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = input.nextInt();

    if (a >= 65 && a <= 100)
        System.out.println("False");
    else
        System.out.println("True");
  }
}