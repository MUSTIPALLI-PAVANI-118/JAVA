import java.util.Scanner;
public class Sum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE N VALUE:");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            count +=i;

        }
        System.out.println("SUM OF N NUMBERS IS:"+count);
        sc.close();
    }
}
