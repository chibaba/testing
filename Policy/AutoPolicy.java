public class AutoPolicy{
    private int accountNumber;
    private String makeAndModel;
    private String State;

    public AutoPolicy(int accountNumber, String makeAndModel, String State) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.State = State;
    }
     public void setAccountNumber(int accountNumber){
         this.accountNumber = accountNumber;
     }
     public int getAccountNumber() {
         return accountNumber;
     }
}