public class Increment {
    public static void main(String[]args){
        int n=8;
        System.out.println("number before pre increment "+n);
        System.out.println("number after pre increment "+(n++));
        System.out.println("number before post increment "+n);
        System.out.println("number after post increment "+(++n));
        System.out.println("number before pre decrement "+n);
        System.out.println("number after pre decrement "+(n--));
        System.out.println("number before post decrement "+n);
        System.out.println("number after post decrement "+(--n));
    }
}
