public class U2_L3_Activity_Three
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String first = input.nextLine();

        System.out.println("Enter second word: ");
        String second = input.nextLine();

        String firstlow = first.toLowerCase();
        String secondlow = second.toLowerCase();

        System.out.println(firstlow.compareTo(secondlow));
  }
}
