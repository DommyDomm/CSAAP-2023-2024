class U1_L4_Activity_Three 
{
  public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a circumference: ");

        double circ = input.nextDouble();
        double rad = circ / 2 / Math.PI;
        double area = Math.pow(rad, 2) * Math.PI;

        System.out.println("Radius: " + rad);
        System.out.println("Area: " + area);
  }
}
