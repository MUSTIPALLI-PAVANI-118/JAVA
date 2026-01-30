//PRINTING palindrome OF A NUMBER
import java.util.Scanner;
public class Palindrome{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER THE VALUE OF N:");
  int n = sc.nextInt();
  int original = n;
  int reverse=0;
  while (n > 0){
    int digit = n%10;
    reverse = reverse * 10 +digit;
    n =n/10;
  }
  if (original == reverse){
    System.out.println("ENTERED NUM IS PALINDROME");
  }else{
    System.out.println("ENTERED NUM IS NOT A PALINDROME");
  }

    sc.close();
  }
 
}
