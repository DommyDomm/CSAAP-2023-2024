class U1_L4_Activity_Two 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in feet ");
        int leng = input.nextInt();
        int yard = leng/3;
        System.out.println("Length in yards = " + yard);
    }
}
