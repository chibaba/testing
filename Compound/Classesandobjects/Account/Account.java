public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerNumber;

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