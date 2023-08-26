import java.util.Scanner;

public class U2_L8_Activity_Three
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter two doubles");
    double a = input.nextDouble();
    double b = input.nextDouble();
    
    double difference = Math.abs(Math.round(b-a));
    System.out.println("Difference: " + difference);
  }
}