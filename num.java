//Write a Java program to check whether a number is positive or negative.

import java.util.Scanner;
public class Hello{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NUM VALUE:");
    int num = sc.nextInt();
    if (num > 0){
        System.out.println("num is positive");
    } else if (num < 0){
       System.out.println("num is negative");
    } else {
        System.out.println("num is zero");
    }
     sc.close();
   }
}
