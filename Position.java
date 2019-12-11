// how to know the largest of three numbers given 

// pseudo code

// collect first number from user
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

import java.util.Scanner;

public class Position {
    public static void main(String...args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number");
        int number1 = input.nextInt();

        System.out.print("Enter Second Number");
        int number2 = input.nextInt();

        System.out.print("Enter third Number");
        int number3 = input.nextInt();


        System.out.print("Enter third Number");
        int number4= input.nextInt();


        System.out.print("Enter third Number");
        int number5 = input.nextInt();

         int largest =0;
        //  int position = 0;
            
          if (number1 > largest){
              largest = number1;
            //   position = 1;
          }
          if (number2 > largest) {
              largest = number2;
            //   position= 2;
          }
          if (number3 > largest) {
              largest = number3;
            //   position= 3;
          }
          if (number4 > largest) {
             largest = number4;
          }
          if (number5 > largest) {
              largest = number5;
          }
          System.out.print(largest);
        //   System.out.print(position);

    }
}

