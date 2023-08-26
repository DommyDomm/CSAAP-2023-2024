import java.util.Scanner;

public class U2_L7_Activity_Two
{
  public static void main(String[] args)
  {
  
    Scanner scan = new Scanner(System.in);
    Integer x = null;
    Integer y = null;

    System.out.print(x + " ");
    System.out.println(y);
    System.out.println("Enter values:");
    x = scan.nextInt();
    y = scan.nextInt();

    Double avg = ((double)(x + y) / 2);
    System.out.println("Average of " + x + " and " + y + " is " + avg);
  }
}
