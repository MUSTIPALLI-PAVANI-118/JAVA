//Find **Sum of Digits*
import java.util.Scanner;
public class Hello{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER THE VALUE OF N:");
  int n = sc.nextInt();
  int sum =0;
  while (n!=0){
    int digit = n%10;
    sum = sum  + digit;
    n = n / 10;
  }
  System.out.println("THE SUM OF THE DIGITS OF THE GIVEN NUMBER IS "+ sum);
    sc.close();
  }
}
