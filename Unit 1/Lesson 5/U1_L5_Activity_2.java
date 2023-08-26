class U1_L5_Activity_Two 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a four digit number: ");
        int num = input.nextInt();
        String numStr = Integer.toString(num);
        for (int i = numStr.length(); i > 0; i--){
            System.out.println(numStr.charAt(i - 1));
        }
    }
}
