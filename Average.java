import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int []arr=new int[n];
        int sum=0;
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        double  average=(double)sum/n;
        System.out.println("AVERAGE OF ARRAY ELEMENTS IS:"+average);
        sc.close();
        
    }
}