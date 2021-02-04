package java4Jo;

public class Clerk implements Menu {

	private String pizzaOrder;
	private String drinkOrder;

	public String getPizzaOrder() {
		return pizzaOrder;
	}

	public void setPizzaOrder(String pizzaOrder) {
		this.pizzaOrder = pizzaOrder;

	}

	public String getDrinkOrder() {
		return drinkOrder;
	}

	public void setDrinkOrder(String drinkOrder) {
		this.drinkOrder = drinkOrder;
	}

	@Override
	public String pizzaMenu(Chief chief) {
		chief.setOrder(pizzaOrder);
		return chief.getOrder();
	}

	@Override
	public String drinkMenu() {
		return getDrinkOrder();
	}

}
