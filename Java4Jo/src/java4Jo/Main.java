package java4Jo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guest guest = new Guest("¿”OO",50000);
		
		PizzaStore pizzaStore = new PizzaStore();
		pizzaStore.order(guest);
		
		guest.eat();
	}

}
