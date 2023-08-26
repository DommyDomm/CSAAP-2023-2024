import java.util.Scanner;
import shapes.*;

public class U2_L5_Activity_Two
{
  public static void main(String[] args)
  {
        Scanner input  = new Scanner(System.in);
        System.out.println("Type a number for length and width: ");
        double lw  = input.nextDouble();

        System.out.println("Type a length: ");
        double length = input.nextDouble();

        System.out.println("Type a width: ");
        double width = input.nextDouble();

        Rectangle rec1 = new Rectangle(lw);
        Rectangle rec2 = new Rectangle(length, width);

        System.out.println(rec1);
        System.out.println(rec2);
  }
}
