public class Repeated_Character {
    public static void main(String[]args){
        char ch='e';
        for(char x='a';x<=ch;x++){
            for(char y='a';y<=x;y++){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
