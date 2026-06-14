import java.util.Scanner;
public class Index {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int []arr=new int[n];
        
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE KEY:");
        int key=sc.nextInt(); 
        int index=-1;  
        for(int i=0;i<n;i++){
            if(key==arr[i]){
                index=i;
                break;
            }
        }
        System.out.println("KEY ELEMENT OF THE ARRAY IS FOUND AT POSITION:"+index);
        sc.close();
        
    }
}