public class U1_L3_Activity_Three
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Java is an object-oriented programming language, true or false?");
    boolean answ1 = input.nextBoolean();
    System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
    boolean answ2 = input.nextBoolean();
    
    System.out.println("Question 1 - Your answer: " + answ1 + ". Correct answer: true");
    System.out.println("Question 2 - Your answer: " + answ2 + ". Correct answer: true");
  }
}
