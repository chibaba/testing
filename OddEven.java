// Odd or Even) Write an application that reads an integer and determines and prints wheth-
// er it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any mul-
// tiple of 2 leaves a remainder of 0 when divided by 2

//pseudo
// collect number from user
//save number from user
// if number is divisible by 2 without a remainder, number is an even number
//if number is duvisible by 1 and itself equals odd number

import java.util.Scanner;

public class OddEven {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number from user");
        int Number = input.nextInt();

        if (Number%2 == 0 && Number > 2) {
          System.out.print(Number);
        } 
        if(Number%2 == 1 ) {
            System.out.print(Number);
        }
    }
}