import java.util.Scanner;
public class Even {
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
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        
        System.out.println("SUM OF EVEN ARRAY ELEMENTS IS:"+sum);
        sc.close();
        
    }
} 
