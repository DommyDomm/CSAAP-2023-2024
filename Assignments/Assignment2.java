import java.util.Scanner;
import assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
    String callSign = input.nextLine();
    double distance = input.nextDouble();
    int bearing = input.nextInt();
    int altitude = input.nextInt();
    callSign = callSign.toUpperCase();
  
    Airplane plane1 = new Airplane();
    Airplane plane2 = new Airplane("AAA02",15.8,128,30000);
    Airplane plane3 = new Airplane(callSign, distance, bearing, altitude);

    System.out.println("");
    System.out.println("Initial Positions:");
    System.out.println("\"Airplane 1\"" + ": " + plane1);
    System.out.println("\"Airplane 2\"" + ": " + plane2);
    System.out.println("\"Airplane 3\"" + ": " + plane3);

    //Distances ---
    double dist1 = plane1.distTo(plane2);
    double dist2 = plane1.distTo(plane3);
    double dist3 = plane2.distTo(plane3);

    System.out.println("");
    System.out.println("Initial Distances:");
    System.out.println("The distance between Airplane 1 and Airplane 2 is "+ dist1 + " miles.");
    System.out.println("The distance between Airplane 1 and Airplane 3 is "+ dist2 + " miles.");
    System.out.println("The distance between Airplane 2 and Airplane 3 is "+ dist3 + " miles.");
    
    //Altitude Differences ---
    int alt1 = plane1.getAlt();
    int alt2 = plane2.getAlt();
    int alt3 = plane3.getAlt();
  
    int a = Math.abs(alt1 - alt2);
    int b = Math.abs(alt1 - alt3);
    int c = Math.abs(alt2 - alt3);
  
    System.out.println("");
    System.out.println("Initial Height Differences:");
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + a + " feet.");
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + b + " feet.");
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + c + " feet.");
  
    //New Positions ---
    plane1.gainAlt();
    plane1.gainAlt();
    plane1.gainAlt();
  
    plane2.loseAlt();
    plane2.loseAlt();
  
    plane3.loseAlt();
    plane3.loseAlt();
    plane3.loseAlt();
    plane3.loseAlt();
    
    plane1.move(dist3,65);
    plane2.move(8,135);
    plane3.move(5,55);
  
    System.out.println("");
    System.out.println("New Positions:");
    System.out.println("\"Airplane 1\"" + ": " + plane1);
    System.out.println("\"Airplane 2\"" + ": " + plane2);
    System.out.println("\"Airplane 3\"" + ": " + plane3);
 
    //New Distances
    double newDist1 = plane1.distTo(plane2);
    double newDist2 = plane1.distTo(plane3);
    double newDist3 = plane2.distTo(plane3);
    System.out.println("");
    System.out.println("New Distances:");
    System.out.println("The distance between Airplane 1 and Airplane 2 is "+ newDist1 + " miles.");
    System.out.println("The distance between Airplane 1 and Airplane 3 is "+ newDist2 + " miles.");
    System.out.println("The distance between Airplane 2 and Airplane 3 is "+ newDist3 + " miles.");
  
    //New Height Diffrence
    int newAlt1 = plane1.getAlt();
    int newAlt2 = plane2.getAlt();
    int newAlt3 = plane3.getAlt();
  
    int d = Math.abs(newAlt1 - newAlt2);
    int e = Math.abs(newAlt1 - newAlt3);
    int f = Math.abs(newAlt2 - newAlt3);
  
    System.out.println("");
    System.out.println("New Height Differences:");
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + d + " feet.");
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + e + " feet.");
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + f + " feet.");
  }
}
