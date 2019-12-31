public class InitArray {
    public static void main(String[] args) {
        // declare variable array and initialize it with an  array object
        int[] array = new int[10]; //created the array object

        System.out.printf("%s%8s%n", "Index", "Value"); //columnheading
        //output each element's value

        for (int counter = 0; counter < array.length; counter++)
        System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}