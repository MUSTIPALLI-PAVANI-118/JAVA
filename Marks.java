import java.util.Scanner;
public class Marks {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter subject 1 marks:");
        int a=sc.nextInt();
        System.out.print("enter subject 2 marks:");
        int b=sc.nextInt();
        System.out.print("enter subject 3 marks:");
        int c=sc.nextInt();
        System.out.print("enter subject 4 marks:");
        int d=sc.nextInt();
        System.out.print("enter subject 5 marks:");
        int e=sc.nextInt();
        int total=a+b+c+d+e;
        double average=(total)/5.0;
        System.out.println("average of numbers:"+average);
        double percentage=(total/500.0)*100;
        System.out.println("percentage of numbers:"+percentage);
        sc.close();
    }
    
}
