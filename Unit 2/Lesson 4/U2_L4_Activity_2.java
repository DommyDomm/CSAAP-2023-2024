import java.util.Scanner;

public class U2_L4_Activity_Two{
  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str4 = str1.toUpperCase();
    String str2 = new String(str1);
    String str3 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
    
    
    System.out.println(str3);
    System.out.println(str4);
  
  }
}