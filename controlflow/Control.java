import java.util.Scanner;

public class Control {
   public static void main(String...args) {
       int total = 0;
       int gradeCounter = 0;
       int aCount = 0;
       int bCount = 0;
       int cCount = 0;
       int dCount = 0;
       int fCount = 0;

       Scanner input = new Scanner(System.in);

       System.out.printf("%s%n%s%n  %s%n %s%n",
       "Enter the integer grade 0-100",
       "Type the end-of-file indicator to terminate input:",
       "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
        "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {
            int grade = input.nextInt();
        }

   }
}