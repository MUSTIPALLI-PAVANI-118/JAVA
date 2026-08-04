import java.util.Scanner;
public class Vowel {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER CHARACTER:");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("entered character is vowel");
        }else{
            System.out.println("entered character is consonant");
        }
        sc.close();
    }
}
