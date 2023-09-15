import java.util.Scanner;

public class U3_L1_Activity_Three
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter two integers: ");
    int x = input.nextInt();
    int y = input.nextInt();
    
    if (y == (x*2))
      System.out.println("YES");
  }
}