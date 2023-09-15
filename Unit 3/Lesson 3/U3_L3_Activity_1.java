import java.util.Scanner;

public class U3_L3_Activity_One
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");

        int x = input.nextInt();
        if (x % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
  }
}