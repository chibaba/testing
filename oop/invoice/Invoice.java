// ( Invoice Class) Create a class called Invoice that a hardware store might use to represent
// an invoice for an item sold at the store. An Invoice should include four pieces of information as
// instance variables—a part number (type String ), a part description (type String ), a quantity of the
// item being purchased (type int ) and a price per item ( double ). Your class should have a constructor
// that initializes the four instance variables. Provide a set and a get method for each instance variable.
// In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
// multiplies the quantity by the price per item), then returns the amount as a double value. If the
// quantity is not positive, it should be set to 0 . If the price per item is not positive, it should be set to
// 0.0 . Write a test app named InvoiceTest that demonstrates class Invoice ’s capabilities.
public class Invoice {

	private String partNo;
	private String partDescription;
	private int quantity;
	private double itemPrice;
	
	public Invoice(String partNo, String partDescription, int quantity, double itemPrice){
		
		this.partNo = partNo;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}
	
	public void setPartNo (String partNo){
		this.partNo = partNo;
	}
	
	public String getPartNo (){
		return partNo;
	}
	
	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;
	}
	
	public String getPartDescription(){
		return partDescription;
	}
	
	public void setQuantity (int quantity){
		this.quantity = quantity;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setItemPrice(double itemPrice){
		this.itemPrice = itemPrice;
	}
	
	public double getItemPrice(){
		return itemPrice;
	}
	
	public double getInvoiceAmount(){
		if (quantity < 0){
			return 0;
		}
		
		else if (itemPrice < 0){
			return 0.0;
		}
		return quantity*itemPrice;
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
