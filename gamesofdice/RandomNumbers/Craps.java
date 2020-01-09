package gamesofdice.RandomNumbers;// You roll two dice. Each die has six faces, which contain one, two, three, four, five and
// six spots, respectively. After the dice have come to rest, the sum of the spots on the two
// upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
// is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
// sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
// you must continue rolling the dice until you “make your point” (i.e., roll that same
// point value). You lose by rolling a 7 before making your point.

import java.security.SecureRandom;
 public class Craps {
     private static final SecureRandom randomNumbers = new SecureRandom();
     private enum Status { CONTINUE, WON , LOST };

     // constants that represents common rolls of the dice
     private static final int SNAKES_EYES = 2;
     private static final int TREY = 3;
     private static final int SEVEN = 7;
     private static final int ELEVEN = 11;
     private static final int BOX_CARS = 12;
     //plays one game of craps
     public static void main(String[] args) {
         int myPoint = 0; // point if no win or lose on first roll
         Status gameStatus; // can contain CONTINUE, WON or LOST
         int sumOfDice = rollDice(); // first roll of the dice

         // determine game status and points based on first roll
         switch (sumOfDice) {
             case SEVEN: // win with 7 on the first roll
             case ELEVEN: // WIN WITH 11 in firs roll
             gameStatus = Status.WON;
             break;
             case SNAKES_EYES: //LOSE WITH 2 ON THE FIRST ROLL
             case TREY: // lose with 3 on the first roll
             case BOX_CARS: //lose with 12 on the first roll
             gameStatus = Status.LOST;
             break;
             default:
             gameStatus = Status.CONTINUE;
             myPoint = sumOfDice;
             System.out.printf("Point is %d%n", myPoint);
         }
         while (gameStatus == Status.CONTINUE) {
             sumOfDice = rollDice();

             if (sumOfDice == myPoint)
             gameStatus = Status.WON;
             else 
             if (sumOfDice == SEVEN)
             gameStatus =   Status.LOST;

         }
         //display won or lost game
         if (gameStatus ==  Status.WON)
         System.out.println("player w ins");
         else
         System.out.println("player lost");
     }
     public static int rollDice() {
         int die1 = 1 + randomNumbers.nextInt(6); //first die roll
         int die2  = 1 + randomNumbers.nextInt(6); //second die roll

         int sum = die1 + die2; //sum of die values
         //display results on this roll
         System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

         return sum;
     }
 }