public class U2_L3_Activity_Four
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        int space = sentence.indexOf(" ");
        System.out.println(space);
  }
}
