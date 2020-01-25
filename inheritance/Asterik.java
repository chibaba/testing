// print to the console
// *
// **
// ***
// ****
//pseudo
//let asterik increment 
// at each line of code
// 



public class Asterik {
    public static void main(String[] main) {
          int row = 2;
        int counter = 10;
          while (row < counter ) {
            int columna = 10;
            int columnb = 10;
            int space = 0;


            while( columna > row) {
                System.out.print("*");
                columna--;
            }
            while(space < row){
            System.out.print("  ");
             space++;
            }
            while(columnb > row) {
                System.out.print("*");
                columnb--;
            }
            System.out.println();
            row++;
            
        } 
    }
}