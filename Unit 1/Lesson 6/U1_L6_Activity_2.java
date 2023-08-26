class U1_L6_Activity_Two 
{
  public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input two decimal numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        int roundNum1 = (int) (num1 + 0.5);
        int roundNum2 = (int) (num2 + 0.5);

        double answer = roundNum1 + roundNum2;

        System.out.println(roundNum1 + " + " + roundNum2 + " = " + answer);
  }
}
