public class U2_L3_Activity_Two
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("How many characters would you like to delete at the end?");
        int del = input.nextInt();

        String word = str.substring(0, str.length()-del);
        System.out.println(word);
  }
}
