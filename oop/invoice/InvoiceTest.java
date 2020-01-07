import java.util.Scanner;

public class InvoiceTest{
	
	public static void main (String... args){
		
		Scanner input = new Scanner (System.in);
		
		Invoice invoice = new Invoice (" ", " ", 0, 0.0);
		
		
		System.out.println("Enter Part No");
		
		String pN = input.nextLine();
		
		invoice.setPartNo(pN);
		
		
		System.out.println("Enter Part Description");
		
		String pD = input.nextLine();
		
		invoice.setPartDescription(pD);
		
		
		System.out.println("Enter no of Quanity");
		
		int q = input.nextInt();
		
		invoice.setQuantity(q);
		
		
		System.out.println("Enter price per item");
		
		double p = input.nextDouble();
		
		invoice.setItemPrice(p);
		
		
		System.out.printf("Invoice Details %n: %s%n %s%n %d%n %.2f%n", invoice.getPartNo(), invoice.getPartDescription(), invoice.getQuantity(), invoice.getItemPrice());
		
		System.out.printf("Invoice Amount is: $%.2f", invoice.getInvoiceAmount());
			
			
	}

}