public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerNumber;

    public Account(int customerNumber, String customerEmail, String customerName, String number, double balance) {
        this.number = number;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.customerEmail = customerEmail;
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        this. balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made New balance is " +  balance);
    }
    public void withdrawal(double withdrawalAmount) {
        if(balance - withdrawalAmount < 0) {
            System.out.println("only " + balance +" available.Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Only " + this.balance + " processed. Remaining balance = " + balance);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }

    public void setCustomerNumber(int number){
        this.customerNumber = number;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
}