// public class EvenNo {
//     public static void main(String[] args) {
//         int counter = 2;
//          int sum = 0;
//          if (counter = 2, counter <)
//     }
// }

import java.util.Scanner;
public class EvenNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int sum=0;
        int even =0;
        for(int i=0;i<=n;i++) {
            if(even%2==0) {
                sum=sum+even;
            }
            even=even +2;
        }
        System.out.print(""+sum);
    }
}