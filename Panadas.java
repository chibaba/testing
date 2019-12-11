// how to know the largest of three numbers given 

// pseudo code

// collect first number from user
// save first number from user
// collect secondNumber from user
//save second number
//collect thiurd number
//save third Number

//compare  first number and second number
// return the greatest number
//save the highest number as result

// comppare the result with the third number
// return result of the greatest number

import java.util.Scanner;

public class Panadas {
    public static void main(String...args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number");
        int number1 = input.nextInt();

        System.out.print("Enter Second Number");
        int number2 = input.nextInt();

        System.out.print("Enter third Number");
        int number3 = input.nextInt();

         if( number1 > number2) {
             System.out.print(number1);
         } else {
               System.out.print(number2);
         } if (number3 > number2) {
             System.out.println(number3);
         } else {
             System.out.print(number2);
         } if (number1 > number3) {
             System.out.print(number1);
         } else {
             System.out.print(number3);
         }

    }
}

