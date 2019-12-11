// how to know the sum, average, product, largest, smallest 

// pseudo code

// collect five number from user
// save first number from user
// collect secondNumber from user
//save second number
//collect thiurd number
//save third Number

//compare  first number and second number
// return the position of the number
//save the highest number as result

// comppare the result with the third number
// return position of the greatest number

// multiply number1, number2,number3;
// add the sum of number1, number2, number3

import java.util.Scanner;

public class Smallest {
    public static void main(String...args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number");
        int number1 = input.nextInt();

        System.out.print("Enter Second Number");
        int number2 = input.nextInt();

        System.out.print("Enter third Number");
        int number3 = input.nextInt();


        System.out.print("Enter third Number");
        int number4 = input.nextInt();


        System.out.print("Enter third Number");
        int number5 = input.nextInt();

        //   the sum of the three integers
     
            int smallest =0;
           
          if (number1 < smallest ){
              smallest = number1;
          }
          if (number2 < smallest) {
              smallest = number2;
          }
          if (number3 < smallest) {
              smallest = number3;
          }
          if (number4 < smallest) {
              smallest = number4;
          }
          if (number5 < smallest) {
              smallest = number5;
          }
          System.out.print(smallest);

    }
}

