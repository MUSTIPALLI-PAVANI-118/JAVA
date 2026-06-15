import java.util.Scanner;
public class Odd_Index {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ARRAY INDEX ELEMENTS ARE:");
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.println(arr[i]+"");
            }
            
        }
        sc.close();
        
    }
}
