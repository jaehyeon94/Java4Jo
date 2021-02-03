package Test_20210114;

public class Coffee {
	
	private String coffeeName; // Ŀ�� �̸�
	private int coffeeMoney; // Ŀ�� ����
	private boolean beans; // ����
	private boolean water;
	private boolean milk; // ����
	private boolean sugar; // ����
	private boolean syrup; // �÷�
	private boolean cinnamon; // �ó���
	private boolean javaChip; // �ڹ�Ĩ
	
	Coffee() {}
	
	Coffee(String coffeeName) {
		this.coffeeName = coffeeName;
		if(coffeeName.equals("�Ƹ޸�ī��")) {
			this.coffeeMoney = 5000;
		} else if(coffeeName.equals("ī���")) {
			this.coffeeMoney = 5500;
		} else if(coffeeName.equals("�ٴҶ��")) {
			this.coffeeMoney = 6000;
		} else if(coffeeName.equals("ī���ī")) {
			this.coffeeMoney = 6000;
		}
		this.beans = false;
		this.water = false;
		this.milk = false;
		this.sugar = false;
		this.syrup = false;
		this.cinnamon = false;
		this.javaChip = false;
	}

	
	
	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getCoffeeMoney() {
		return coffeeMoney;
	}

	public void setCoffeeMoney(int coffeeMoney) {
		this.coffeeMoney = coffeeMoney;
	}

	public boolean isBeans() {
		return beans;
	}

	public void setBeans(boolean beans) {
		this.beans = beans;
	}

	
	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean isSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	public boolean isSyrup() {
		return syrup;
	}

	public void setSyrup(boolean syrup) {
		this.syrup = syrup;
	}

	public boolean isCinnamon() {
		return cinnamon;
	}

	public void setCinnamon(boolean cinnamon) {
		this.cinnamon = cinnamon;
	}

	public boolean isJavaChip() {
		return javaChip;
	}

	public void setJavaChip(boolean javaChip) {
		this.javaChip = javaChip;
	}
	
	

}
