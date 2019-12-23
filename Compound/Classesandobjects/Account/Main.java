public class Main{
    public static void main(String[] args){

        Account chibabaAccount = new Account(12345, "chibaba@gmail.com", "chibaba", "(080023412234)", 234.09);
        chibabaAccount.withdrawal(100.0);

        chibabaAccount.deposit(50.00);
        chibabaAccount.withdrawal(100.0);

        chibabaAccount.deposit(52.00);
        chibabaAccount.withdrawal(100.0);
    }
}