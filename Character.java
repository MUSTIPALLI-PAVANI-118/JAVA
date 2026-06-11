public class Character {
    public static void main(String[]args){
        char ch='e';
        for(char x='a';x<=ch;x++){
            for(char y='a';y<=x;y++){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
