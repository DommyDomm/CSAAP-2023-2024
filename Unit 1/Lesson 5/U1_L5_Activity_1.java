class U1_L5_Activity_One 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a three digit number: ");
        int num = input.nextInt();
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++){
            System.out.println(numStr.charAt(i));
        }
    }
}
