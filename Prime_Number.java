public class Prime_Number {
    public static void main(String[]args){
        int n=100;
        boolean isprime=false;
        if(n<=1){
            isprime=true;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println(n);
        }
        
       
    }
}
