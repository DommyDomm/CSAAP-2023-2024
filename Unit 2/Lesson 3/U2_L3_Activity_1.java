public class U2_L3_Activity_One
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        String start = str.substring(0, num);
        String end = str.substring(str.length()-num, str.length());
        System.out.println(start + end);
  }
}
