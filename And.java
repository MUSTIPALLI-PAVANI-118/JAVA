public class And {
    public static void main(String[]args){
        int n=100;
        int x=10;
        if(n>=100 && ++x>10){
            System.out.println("& operator is used");
        }
        else{
            System.out.println("operator is not used");
        }
        System.out.println("value of x is "+x);
    }
}
