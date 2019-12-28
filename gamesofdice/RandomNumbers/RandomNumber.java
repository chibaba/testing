//  shifted  and scaled  random integers

import java.security.SecureRandom;

public class RandomNumber {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        // loop 20 times
        for(int counter = 1; counter<= 20; counter++) {
            //pick random number from 1 to 6
            int brown = 1 + randomNumbers.nextInt(6);
            System.out.printf("%d ", brown); // display generated value
            // if counter is divisible by 5, start a new line of output
            if ( counter % 5 == 0) {
                System.out.println();
            }
        }
    }
}