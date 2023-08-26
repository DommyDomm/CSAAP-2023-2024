class U1_L4_Activity_Four 
{
  public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a price: ");
        double price = input.nextDouble();

        double change = 10 - price;

        System.out.println("Change from $10: " + "$" + change);
  }
}
