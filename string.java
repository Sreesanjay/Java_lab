import java.util.Scanner;
 
public class string
{
public static void main(String args[])
{
 String str1, str2;
  Scanner sc= new Scanner(System.in);
 
  System.out.print("Enter a String : ");
   str1 = sc.nextLine();
 
   str2 = str1.replaceAll("[aeiouAEIOU]", "");
 
   System.out.println("All Vowels Removed Successfully..\n New String is : ");
 
  System.out.println(str2);
}
}
 