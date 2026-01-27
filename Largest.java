//Find the largest of three numbers.
import java.util.Scanner;
public class Hello{
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
       System.out.println("ENTER THE NUM1:");
       int num1 = sc.nextInt();
        System.out.println("ENTER THE NUM2:");
       int num2 = sc.nextInt();
        System.out.println("ENTER THE NUM3:");
       int num3 = sc.nextInt();
       if (num1 >= num2 && num1 >= num3){
        System.out.println(num1 +"is the largest among three numbers");
       } else if(num2 >= num1 && num2 >= num3){
        System.out.println(num2 + "is the largest among three numbers");
       } else{
        System.out.print(num3 +"is the largest among three numbers");
       }
        sc.close();
 }
}
