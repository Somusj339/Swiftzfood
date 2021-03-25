import java.util.*;
class Customer{
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String customerAddress;
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + customerAddress);
		System.out.println();
	}
	
	public void payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid......");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		System.out.println("Hi " + customerName
				+ ", your final bill amount after discount is: "
				+ (int) (priceAfterDiscount * 100) / 100.0);
	}


}
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.customerName = "Somu";
		customer.customerId = "C100";
		customer.customerAddress = "Bijapur";
		customer.contactNumber = 7411711998L;
		customer.displayCustomerDetails();
		customer.payBill(500, 10);

	}

}
