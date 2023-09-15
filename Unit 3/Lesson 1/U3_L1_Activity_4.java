import java.util.Scanner;

public class U3_L1_Activity_Four
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int x = input.nextInt();
        
        if ((x%2) == 0)
            System.out.println("Divisible by 2!");
        if ((x%3)  == 0)
            System.out.println("Divisible by 3!");
  }
}