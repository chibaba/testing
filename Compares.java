
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

import java.util.Scanner;

public class Compares {

    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number");
        int number1 = input.nextInt();

        System.out.println("Enter Second Number");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        }  else {
            System.out.print(number2);
        }
    }
    
}