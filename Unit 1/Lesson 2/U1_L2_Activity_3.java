class U1_L2_Activity_Three 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("His there. What is your name?");
    String name = scan.nextLine();
    
    System.out.println("What state do you live in? ");
    String state = scan.nextLine();
    
    System.out.println("My name is " + name + "." + " I live in " + state + ".");
  }
}
