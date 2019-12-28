// To show that the numbers produced by nextInt occur with approximately equal likeli-
// hood, let’s simulate 6,000,000 rolls of a die with the application. Each integer
// from 1 to 6 should appear approximately 1,000,000 times.
 import java.security.SecureRandom;

 public class RollDice {
     public static void main(String[] args) {
         SecureRandom randomNumbers = new SecureRandom();
         int dice1 = 0; //count of 1s rolled;
         int dice2 = 0; // count of 2s rolled;
         int dice3 = 0; // count of 3s rolled;
         int dice4 = 0; //count of 4s rolled;
         int dice5 = 0; //count of 5s rolled;
         int dice6 = 0; //count of 6s rolled;
         // tally count roll 6000000 roll for a die

         for (int roll = 1; roll <= 6000000; roll++) {
             int brown = 1 + randomNumbers.nextInt(6); // Numbers from 1 to 6

             // use brown value  1-6 to determine which counter to increment
             switch(brown) {
                 case 1:
                 ++dice1; //increment the 1s counter
                 break;
                 case 2:
                 ++dice2; //increment the 2s counter
                 break;
                 case 3: 
                 ++dice3; //increment the 3s rolled
                 break;
                 case 4:
                 ++dice4; // increment the 4s rolled
                 break;
                 case5:
                 ++dice5; // increment in 5s rolled
                 break;
                 case 6:
                 ++dice6; //increment in 6s rolled
                 break;

             }
         }
         System.out.println("Brown\tDice"); //output headers
         System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", dice1, dice2,
         dice3, dice4, dice5, dice6);
     }
 }