public class EvenCounter{
    public static void main(String[] args) {
        int sum = 0;
        int evenCounter = 0;
        int counter = 0;

        if (counter % 3 == 0){
            sum = sum + counter;
            evenCounter++;
            counter++;
        }
        else {
            counter++;
        }
        System.out.print(sum);
    }
}