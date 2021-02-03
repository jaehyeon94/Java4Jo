package Test_20210129;

public class Customer extends Person {

	private int customerNo; 
	private int miles;
	
	public Customer(String name, String address, String phoneNumber, int customerNo, int miles) {
		super(name, address, phoneNumber);
		this.customerNo = customerNo;
		this.miles = miles;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	@Override
	public String toString() {
		return "Customer [customerNo=" + customerNo + ", miles=" + miles + ", name=" + name + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	
	
	                
}                   
                    