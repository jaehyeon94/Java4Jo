package Test_20210203;

public class Duke extends Sinha implements Identity{

	public Duke(String name, int money, String identity) {
		super(name,money, identity);
		this.identity = identity;
	}

	@Override
	public void giveMoney() {
		// TODO Auto-generated method stub\
		System.out.println("���� : ������ ����.");
		super.money -= 1000;
		super.tax = 1000;
	}
}
