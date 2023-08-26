class U1_L6_Activity_Three 
{
  public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a decimal number: ");
        double num = input.nextDouble() * 1000;

        String nStr = Integer.toString((int) num);

        System.out.print("Answer: "+nStr.charAt(nStr.length() - 3)+" "+nStr.charAt(nStr.length() - 2)+" "+nStr.charAt(nStr.length() - 1));
  }
}
