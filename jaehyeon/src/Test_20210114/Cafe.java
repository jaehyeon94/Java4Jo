package Test_20210114;

import java.util.Scanner;

public class Cafe {
	Scanner sc = new Scanner(System.in);

	public String menu() {
		int number;
		String name = "";
		while (true) {
			System.out.println("------메뉴-------");
			System.out.println("1. 아메리카노 ('5000원')");
			System.out.println("2. 카페라떼 ('5500원')");
			System.out.println("3. 바닐라라떼 ('6000원')");
			System.out.println("4. 카페모카 ('6000원')");
			number = sc.nextInt();
			if (number == 1) {
				name = "아메리카노";
				return name;
			} else if (number == 2) {
				name = "카페라떼";
				return name;
			} else if (number == 3) {
				name = "바닐라라떼";
				return name;
			} else if (number == 4) {
				name = "카페모카";
				return name;
			} else {
				System.out.println("메뉴를 잘못 선택하셧습니다.");
			}
		}
	}

	public void payment(Guest guest, Coffee coffee) throws InterruptedException {
		System.out.println(coffee.getCoffeeName() + "를 주문하셧습니다.");
		System.out.println(coffee.getCoffeeName() + "는 " + coffee.getCoffeeMoney() + " 원입니다.");
		System.out.print("지불한 금액 : ");
		guest.setMoney(sc.nextInt());
		Thread.sleep(1000);
		if (guest.getMoney() > coffee.getCoffeeMoney()) {
			System.out.println(guest.getMoney() + "원 받았습니다.");
			guest.setMoney(guest.getMoney() - coffee.getCoffeeMoney());
			Thread.sleep(1000);
			System.out.println("거스름돈은 " + guest.getMoney() + "원입니다.");
		} else {
			System.out.println("금액이 부족합니다.");
			System.exit(0);
		}
		Thread.sleep(1000);
	}

	public void order(Barista barista, Guest guest, Coffee coffee) throws InterruptedException {
		payment(guest, coffee);
		barista.make(coffee);

		System.out.println("현재 " + coffee.getCoffeeName() + "를 만드는 중입니다.");
		System.out.println("잠시만 기다려 주십시오");

		Thread.sleep(10000);

		orderPrint(coffee, guest);
	}

	public void orderPrint(Coffee coffee, Guest guest) {
		System.out.println("주문하신 " + coffee.getCoffeeName() + " 나왔습니다.");
	}

}
