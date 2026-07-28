import java.util.Scanner;
public class Printf {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String name=sc.nextLine();
        System.out.println("ENTER YOUR AGE:");
        int age=sc.nextInt();
        System.out.println("ENTER YOUR PERCENTAGE:");
        double percentage=sc.nextDouble();
        System.out.printf("NAME %s",name );
        System.out.printf("age %d",age);
        System.out.printf("percentage %f",percentage);
        sc.close();
    }
}