class U1_L4_Activity_One
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number (must be an integer)");
        System.out.println(">");
        int n = input.nextInt();

        for(int i=0; i<4; i++){
            n++;
            System.out.println("number is now " + n);
        }
        for(int i=0; i<4; i++){
            n--;
            System.out.println("number is now " + n);
        }
  }
}
