import java.util.Scanner;
public class Asteriks{
    public static void main(String[] args) {

Scanner cal = new Scanner (System.in);
System.out.println("Enter the number of rows you want");
int n = cal.nextInt();
int rows = 0;
while (rows < n)
{
    int column = 0;
    while (column < n - rows)
    {
        System.out.print(" ");
        column++;
    }
    int currentAsteriks = 0;
    while (currentAsteriks <= rows)
    {
        System.out.print(" *"); 
        currentAsteriks++;
    }
    System.out.print("\n");
    rows++;
}
    }
}