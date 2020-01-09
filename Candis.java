// (Separating the Digits in an Integer) Write an application that inputs one number consist-
// ing of five digits from the user, separates the number into its individual digits and prints the digits
// separated from one another by three spaces each. For example, if the user types in the number 42339 ,
// the program should print
// 4
// 2
// 3
// 3
// 9
// Assume that the user enters the correct number of digits. What happens when you enter a
// number with more than five digits? What happens when you enter a number with fewer than five
// digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
// need to use both division and remainder operations to “pick off ” each digit.]

//pseudo
// collect and save number from user
// print out formatted output using % && / 
// ensuring that characters has 3 spaces
 
import java.util.Scanner;
 public class Candis{
     public static void main(String...args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Digits");
          
         int number = input.nextInt();
        int a;
        int b;
        int c;
        int d;
        int e;
        a = number/10000;
         int rem = number-(a*10000);
         b = rem/1000;
          rem = number-(b*1000);
        c = rem/100;
          rem = number-(c*100);
        d = rem/10;
          rem = number-(d*10);
        e = rem/1;
           rem = number-(e*1);
             System.out.printf("%d %d %d %d %d", a,b,c,d,e);
         }

     }j