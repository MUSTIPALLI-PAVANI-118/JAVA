import java.util.Scanner;
public class Count_Odd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE:");
        int n=sc.nextInt();
        int []arr=new int[n];
        int count=0;
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                count+=1;
            }
        }
        System.out.println("COUNT OF ODD ARRAY ELEMENTS IS:"+count);
        sc.close();
    }
}