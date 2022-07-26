import java.util.Scanner;
import java.math.*;

class Main {
  public static void main(String[] args) 
  {
   Scanner scan = new Scanner(System.in);

   
   System.out.println("Enter a number to convert: ");
   int userNum = scan.nextInt();
   System.out.println("Enter the base: ");
   int userBase = scan.nextInt();
   String xA = "";
   while(userBase > 9 ||userBase < 2)
   {
     System.out.println("Enter a base between 2-9");
     userBase = scan.nextInt();
   }
   xA = changeBase(userNum, userBase);
   System.out.println(xA);
   
  }

 public static String changeBase(int iNum, int iBase) {
    String result = ((iNum % iBase == 0) ? "0" : "1"); // expr

    if (Math.abs(iNum) > 1) {
        result = changeBase(iNum / iBase, iBase) + result;
    }
    return result;
}
}