package Test_20210203;

public class Count extends Sinha implements Identity{

	public Count(String name, int money, String identity) {
		super(name,money,identity);
	}

	
	@Override
	public void giveMoney() {
		// TODO Auto-generated method stub\
		System.out.println("���� : ������ ���� �ʴ´�.");
	}

}
