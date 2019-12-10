// write a code that takes 3 numbers, add the first  two numbers
//, if the result is greater than the third 
// print result. if third number is greater than result print third number.

//pseudo code
// Ask first number from user
//collect first number from user
//save first number

//ask for second number
//collect second number from user
//save second number

//ask for third number
//collect third number
//save third number

//add first two numbers
//save first two number
//compare result by third number
//if result is greater than third number print to console
//if third number is greater than result print third number

import java.util.Scanner;
public class Fanta {
    public static void main(String...args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

       int result1 = number1 + number2;

        if(result1 > number3) {
            System.out.print(result1);
        } else {
           System.out.print(number3);
        }
   }
}

//write a programme that is going to take two numbers and
//print out the biggest no
//pseudo

//Ask user to input number
//collect first number
//save first number
//Ask user for second number 
//collect second number
//save the secondNumber 

//compare first numbers and second numbers
//print result to the console
