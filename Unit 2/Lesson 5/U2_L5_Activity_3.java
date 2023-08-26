import java.util.Scanner;
import shapes.*;

public class U2_L5_Activity_Three
{
  public static void main(String[] args)
  {
        Scanner input  = new Scanner(System.in);
        System.out.println("Type a side length: ");
        double length = input.nextDouble();

        RegularPolygon triangle = new RegularPolygon(length);
        RegularPolygon square = new RegularPolygon(4, length);

        System.out.println(triangle);
        System.out.println(square);
  }
}
