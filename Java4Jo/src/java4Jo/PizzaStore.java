package java4Jo;

import java.util.Scanner;

public class PizzaStore {

	private Chief chief;
	private Clerk clerk;
	private int money;

	private Scanner sc = new Scanner(System.in);

	public PizzaStore() {
		this.chief = new Chief();
		this.clerk = new Clerk();
		money = 10000;
	}

	public void order(Guest guest) {
		int price = 0;
		int pizza;
		int drink;
		System.out.println("-----------------------");
		System.out.println("		피자 메뉴		");
		System.out.println("1.봉골레 피자(12000), 2.불고기 피자(11000), 3.콰트로 피자(12000) 4.스테이크 피자(12000) 5.블랙타이거 피자(13000)");
		pizza = sc.nextInt();
		switch (pizza) {
		case 1:
			clerk.setPizzaOrder("봉골레 피자");
			price += 12000;
			break;
		case 2:
			clerk.setPizzaOrder("불고기 피자");
			price += 12000;
			break;
		case 3:
			clerk.setPizzaOrder("콰트로 피자");
			price += 12000;
			break;
		case 4:
			clerk.setPizzaOrder("스테이크 피자 ");
			price += 12000;
			break;
		case 5:
			clerk.setPizzaOrder("블랙타이거 피자");
			price += 12000;
			break;
		default:
			System.out.println("없는 메뉴입니다.");
		}
		System.out.println("		음료수 메뉴		");
		System.out.println("1.콜라(1000), 2.사이다(1000), 3.환타(1000)");
		drink = sc.nextInt();
		switch (drink) {
		case 1:
			clerk.setDrinkOrder("콜라");
			price += 1000;
			break;
		case 2:
			clerk.setDrinkOrder("사이다");
			price += 1000;
			break;
		case 3:
			clerk.setDrinkOrder("환타");
			price += 1000;
			break;
		default:
			System.out.println("없는 메뉴입니다.");
		}
		if(guest.getMoney() < price) {
			System.out.println("돈이 부족합니다.");
		} else {
			System.out.println("결제 되었습니다.");
			System.out.println("잠시만 기려다 주세요.");
			money += price;
			guest.setPizza(clerk.pizzaMenu(chief));
			guest.setDrink(clerk.drinkMenu());
			
			System.out.println("주문하신 " + guest.getPizza() + "와 " + guest.getDrink() + " 나왔습니다.");

		}

	}

}