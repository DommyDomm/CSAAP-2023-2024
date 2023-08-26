public class U2_L2_Activity_One
{
  public static void main(String[] args)
  {
        Scanner input = new Scanner(System.in);
        System.out.println("What type of item are you buying?");
        String type = input.nextLine();
        System.out.println("How many are you buying?");
        int amount = input.nextInt();
        System.out.println("How much does each one weigh?");
        double weight = input.nextDouble();
        double total = weight * amount;
        System.out.println(amount+" "+type+" at "+weight+" pounds each will weigh "+total+" pounds total");
  }
}
