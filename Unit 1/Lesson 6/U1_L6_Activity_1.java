class U1_L6_Activity_One 
{
  public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numerator: ");
        int numerator = input.nextInt();

        System.out.println("Please enter the denominator: ");
        int denominator = input.nextInt();

        double value = (double) numerator / denominator;
        System.out.println("The decimal value is " + value);
  }
}
