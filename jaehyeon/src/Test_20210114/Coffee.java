package Test_20210114;

public class Coffee {
	
	private String coffeeName; // 커피 이름
	private int coffeeMoney; // 커피 가격
	private boolean beans; // 원두
	private boolean water;
	private boolean milk; // 우유
	private boolean sugar; // 설탕
	private boolean syrup; // 시럽
	private boolean cinnamon; // 시나몬
	private boolean javaChip; // 자바칩
	
	Coffee() {}
	
	Coffee(String coffeeName) {
		this.coffeeName = coffeeName;
		if(coffeeName.equals("아메리카노")) {
			this.coffeeMoney = 5000;
		} else if(coffeeName.equals("카페라떼")) {
			this.coffeeMoney = 5500;
		} else if(coffeeName.equals("바닐라라떼")) {
			this.coffeeMoney = 6000;
		} else if(coffeeName.equals("카페모카")) {
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
