public class U2_L1_Activity_Two
{
  public static void main(String[] args)
  {
        String order = "apple pie";
        Scanner input = new Scanner(System.in);
        System.out.println("The current order is " + order);
        System.out.println("I want to eat something else, what do you want to eat?");
        order = input.nextLine();
        System.out.println("The order has changed to " + order);
  }
}
