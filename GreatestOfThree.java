import java.util.Scanner;

class GreatestOfThree {
   GreatestOfThree() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int var2 = var1.nextInt();
      System.out.print("Enter second number: ");
      int var3 = var1.nextInt();
      System.out.print("Enter third number: ");
      int var4 = var1.nextInt();
      if (var2 >= var3 && var2 >= var4) {
         System.out.println("Greatest number is: " + var2);
      } else if (var3 >= var2 && var3 >= var4) {
         System.out.println("Greatest number is: " + var3);
      } else {
         System.out.println("Greatest number is: " + var4);
      }

      var1.close();
   }
}
