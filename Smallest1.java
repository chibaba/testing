// (Find the Smallest Value) Write an application that finds the smallest of several integers.
// Assume that the first value read specifies the number of values to input from the user.
import java.util.Scanner;

public class Smallest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter next number");
        int nums = input.nextInt();
        int smallest = 0;
        while (nums >0) {
            System.out.println("Enter next number");
           // int nums = input.nextInt();
            //smallest = nums;
            if(nums < smallest) {
                smallest = nums;
            }
            nums--;
        }
        System.out.println(smallest);

    }
}