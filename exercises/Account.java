//create a new class for a bank
//create fields for the account no, balance, customer name, email, and phone no
//create get users and setters for each fields
// create two additional method
//1. to allow customers to deposit fund (this should increment the balance of field);
//2. to allow cutomer to withdraw funds (this should deduct from the balance field);
//but not allow the withdrawal to complete if there are insufficient funfds

//pseudo
// generate account no for user
//give a default account balance
// 

import java.util.Scanner;

public class Account {
    private int accountNo;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }
    public int getAccountNo() {
        return accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}