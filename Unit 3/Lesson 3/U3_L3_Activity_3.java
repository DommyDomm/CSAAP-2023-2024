import java.util.Scanner;

public class U3_L3_Activity_Three
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(a +  " + " + b + "= ?");
        int c = input.nextInt();
        int d = a + b;
        if (c == d)
            System.out.println("Correct!");
        else
            System.out.println("Wrong");
  }
}