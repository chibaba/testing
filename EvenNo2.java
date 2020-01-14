import java.util.Scanner;

public class EvenNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        int matches = 0;

        while(matches < n) {
            i++;
            if(i % 2 == 0 ) { 
      
                sum += 2;
                matches++;
            }
        }
        System.out.println(String.format("%d", sum));
    }
}