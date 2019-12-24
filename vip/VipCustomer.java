//create a new class vip customer
//it should have 3 fields name, credit limit, email address
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
//3rd constructor should save all fields
//create getters for this 
//test and confirms it works


public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
    this("defaultName", 4302.00, "default@gmail.com");
    }
    public  VipCustomer (String name, double creditLimit) {
     this("name", creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress ) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
     public String getName() {
         return name;
     }
     public double getCreditLimit() {
         return creditLimit;
     }

     public String getEmailAddress() {
         return emailAddress;
     }
   
}