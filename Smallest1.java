// (Find the Smallest Value) Write an application that finds the smallest of several integers.
// Assume that the first value read specifies the number of values to input from the user.
import java.util.Scanner;

public class Smallest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)
        int nums = input.nextInt()
        while (n>0) {
            System.out.println("Enter next number");
            int nums = input.nextInt();
            smallest = nums
            if(number < smallest) {
                smallest = number
            }
            n--;
        }
        System.out.printlm(smallest)

    }
}