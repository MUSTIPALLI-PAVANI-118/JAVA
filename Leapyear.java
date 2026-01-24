import java.util.Scanner;
public class Hello{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE YEAR:");
    int year = sc.nextInt();
    if (year%400==0){
      System.out.println("ENTER THE YEAR IS A LEAP YEAR");
    }else if(year%100==0){
      System.out.println("ENTER THE YEAR IS NOT A LEAP YEAR");
      } else if(year%4==0){
        System.out.println("ENTER THE YEAR IS A LEAP YEAR");
      }else{
        System.out.println("ENTER THE YEAR IS NOT A LEAP YEAR");
      }
    }
  }
