import java.util.Scanner;

public class U3_L3_Activity_Four
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature?");
        int a = input.nextInt();

        if (a >= 97 && a <= 99)
            System.out.println("Temperature is OK");
        else {
            System.out.println("NOT NORMAL");
        }
  }
}