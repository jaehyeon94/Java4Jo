package java4Jo;

public class Guest {

	private String name;
	private String pizza;
	private String drink;
	private int money;
	
	public Guest(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public Guest(String pizza, String drink) {
		super();
		this.pizza = pizza;
		this.drink = drink;
	}

	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPizza() {
		return pizza;
	}

	public void setPizza(String pizza) {
		this.pizza = pizza;
	}


	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public void eat() {
		System.out.println(name+"님은 " + pizza + "와 " + drink + "를 마십니다.");
	}
	
	public void showMoney() {
		System.out.println("현재 소지한 급액은 " + getMoney() + "원입니다.");
	}

}
