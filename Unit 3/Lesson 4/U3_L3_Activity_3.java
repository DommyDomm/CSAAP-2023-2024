import java.util.Scanner;

public class U3_L4_Activity_Three
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the latitude: ");
    double latitude = input.nextDouble();

    System.out.println("Please enter the longitude: ");
    double longitude = input.nextDouble();

    if (!(latitude >= -90 && latitude <= 90)){
        System.out.println("latitude is incorrect");
        if (!(longitude >= -180 && longitude <= 180))
          System.out.println("longitude is incorrect");
    }
    else if (!(longitude >= -180 && longitude <= 180)){
        System.out.println("longitude is incorrect");
    }
    else
        System.out.println("The location: " + latitude + ", " + longitude);
  }
}