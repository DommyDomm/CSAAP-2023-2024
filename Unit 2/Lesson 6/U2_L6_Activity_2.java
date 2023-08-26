import java.util.Scanner;
import shapes.*;

public class U2_L6_Activity_Two
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of sides: ");
        int sides = input.nextInt();
        System.out.println("Enter the side length: ");
        double length = input.nextDouble();

        RegularPolygon poly = new RegularPolygon();
        poly.setNumSides(sides);
        poly.setSideLength(length);

        double area1 = poly.getArea();

        poly.setNumSides(sides + 2);
        double area2 = poly.getArea();

        System.out.println("Area with " + sides + " sides: " + area1);
        System.out.println("Incrementing the number of sides by two");
        System.out.println("Area with " + poly.getNumSides() + " sides: " + area2);
  }
}
