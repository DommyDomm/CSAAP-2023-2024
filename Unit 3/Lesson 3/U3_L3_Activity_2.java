import java.util.Scanner;

public class U3_L3_Activity_Two
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter grade:");
        String a = input.nextLine();

        if (a.equals("A")) {
            System.out.println("90-100");
        }
        else if (a.equals("B")) {
            System.out.println("80-90");
        }
        else if (a.equals("C")) {
            System.out.println("70-80");
        }
        else if (a.equals("D")) {
            System.out.println("60-70");
        }
        else if (a.equals("F")) {
            System.out.println("0-60");
        }
        else {
          System.out.println("Invalid letter grade");
        }
  }
}