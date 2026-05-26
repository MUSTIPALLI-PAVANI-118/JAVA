import java.util.Scanner;
public class BMI {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weight(kg):");
        double weight=sc.nextDouble();
        System.out.println("enter height(m):");
        double height=sc.nextDouble();
        double body_mass_index=(weight)/(height*height);
        System.out.println("BMI IS "+body_mass_index);
        sc.close();
    }
}
