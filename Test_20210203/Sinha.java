package Test_20210203;

public class Sinha {

	protected String name;
	protected String identity;
	protected int money;
	protected int tax;
	
	public Sinha(String name, int money, String identity) {
		this.name = name;
		this.money = money;
		this.identity = identity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int tax() {
		return money;
	}
	
	
}
	
