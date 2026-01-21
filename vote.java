//Write a program to check whether a person is eligible to vote.

import java.util.Scanner;
public class Hello{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter your age:");
   int age = sc.nextInt();
   if (age >= 18){
   System.out.println("YOU ARE ELIGIBLE TO VOTE");
   } else {
     System.out.println("YOU ARE NOT ELIGIBLE TO VOTE");
   }
    sc.close();
 }
}
