import java.util.Scanner;

public class U2_L8_Activity_Two
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first x-coordinate: ");
    double firstX = input.nextDouble();
    
    System.out.println("Enter the second x-coordinate: ");
    double secondX = input.nextDouble();
    
    System.out.println("Enter the first y-coordinate: ");
    double firstY = input.nextDouble();
    
    System.out.println("Enter the second y-coordinate: ");
    double secondY = input.nextDouble();
    
    System.out.println((secondY-firstY) / (secondX-firstX));
  }
}