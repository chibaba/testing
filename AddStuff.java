public class AddStuff {
    public static void main (String[] args) {
        for (int i = 0; i < 20; i++) {
            if ( i + (i +1) + 6 == 21){
                System.out.printf("%d %d",i,i+1);
                break;  
            }
        }
    }
}