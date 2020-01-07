//creating the summ of an array
public class SumArray {
 public static void main(String[] args) {
     int [] array = { 65, 87, 34, 54, 78, 67, 78, 45, 100};
     int total = 0;
     for (int counter = 0; counter < array.length; counter++) {
         total += array[counter];

         System.out.printf("Total array of element:  %d%n", total);
     }
        
    }

}