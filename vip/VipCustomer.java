//create a new class vip customer
//it should have 3 fields name, credit limit, email address
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
//3rd constructor should save all fields
//create getters for this 
//test and confirms it works


public class VipCustomer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer(String name, String creditLimit, String emailAddress ) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

   
}