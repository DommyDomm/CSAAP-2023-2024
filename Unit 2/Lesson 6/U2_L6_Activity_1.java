import java.util.Scanner;
import shapes.*;

public class U2_L6_Activity_One
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();

        Circle c1 = new Circle(radius);
        c1.setRadius(radius);

        double circum = c1.getCircumference();
        double area = c1.getArea();

        System.out.println("A circle with a radius of " + radius + " has a circumference of " + circum + " and an area of " + area);

  }
}
