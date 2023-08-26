import java.util.Scanner;
public class U2_L1_Activity_One
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What is your favorite number?");
        String num = input.nextLine();

        System.out.println("Your name is " + name + " and you like the number " + num + ".");
  }
}
