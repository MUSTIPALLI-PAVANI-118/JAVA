import java.util.Scanner;
public class Medium {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String name=sc.nextLine();
        System.out.println("ENTER YOUR AGE:");
        int age=sc.nextInt();
        System.out.println("NAME:"+name);
        System.out.println("AGE "+age);
        System.out.println("my name is "+name +".my age is "+age);
        System.out.println("ENTER THE INTEGER:");
        int num1=sc.nextInt();
        System.out.println("ENTER THE INTEGER:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("sum of integers is "+sum);
        System.out.println("ENTER DECIMAL NUMBERS:");
        double num=sc.nextDouble();
        System.out.println("double value is "+num);
        sc.close();                                                                                                                                
    }   
}
