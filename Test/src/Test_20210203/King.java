package Test_20210203;

public class King {

	private String name;
	private int money;
	private Sinha[] sinha;
	
	public King(String name, Sinha[] sinha) {
		this.name = name;
		this.money = 0;
		this.sinha = sinha;
		
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
	public Sinha[] getSinha() {
		return sinha;
	}
	public void setSinha(Sinha[] sinha) {
		this.sinha = sinha;
	}
	
	public void showMoney() {
		Duke duke;
		System.out.println("������ �Ƚ��ϴ�.");
		for(int i = 0; i < sinha.length; i++) {
			if(sinha[i].getIdentity().equals("����")){
				duke = (Duke) sinha[i];
				duke.giveMoney();
				money += duke.tax;
				System.out.println(duke.getName() + duke.getIdentity()+"�Բ��� "+duke.tax+"������ ���˽��ϴ�.");
			}
		}
		System.out.println("���� ���� : " + money);
	}
	
}
