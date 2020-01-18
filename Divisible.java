public class Divisible{
    public static void main(String[] args) {
        int sum = 0;
        int sixCounter = 0;
        int counter = 0;

        while(sixCounter < 50) {
        if (counter % 6 == 0){
            sum -= counter;
        }
        else {
            counter++;
        }
    }
        System.out.print(sum);
    
    }
}