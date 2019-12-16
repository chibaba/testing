import java.util.Scanner;

public class Differentiation{
    private int number;
    private int coefficient;
    private int power;


public void setCoefficientAndPower(){
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter a number");
    number = input.nextInt();
    coefficient = number;
    power = number -1;
}
public int getCoefficient() {
    return coefficient;
}
public int getPower() {
    return power;
}
 public void displayDifferentiation() {
     System.out.printf("the result is %dxr%d", getCoefficient(), getPower());
 }
}
