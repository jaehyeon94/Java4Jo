package Test_20210114;

import java.util.Scanner;

public class Cafe {
	Scanner sc = new Scanner(System.in);

	public String menu() {
		int number;
		String name = "";
		while (true) {
			System.out.println("------�޴�-------");
			System.out.println("1. �Ƹ޸�ī�� ('5000��')");
			System.out.println("2. ī��� ('5500��')");
			System.out.println("3. �ٴҶ�� ('6000��')");
			System.out.println("4. ī���ī ('6000��')");
			number = sc.nextInt();
			if (number == 1) {
				name = "�Ƹ޸�ī��";
				return name;
			} else if (number == 2) {
				name = "ī���";
				return name;
			} else if (number == 3) {
				name = "�ٴҶ��";
				return name;
			} else if (number == 4) {
				name = "ī���ī";
				return name;
			} else {
				System.out.println("�޴��� �߸� �����ϼ˽��ϴ�.");
			}
		}
	}

	public void payment(Guest guest, Coffee coffee) throws InterruptedException {
		System.out.println(coffee.getCoffeeName() + "�� �ֹ��ϼ˽��ϴ�.");
		System.out.println(coffee.getCoffeeName() + "�� " + coffee.getCoffeeMoney() + " ���Դϴ�.");
		System.out.print("������ �ݾ� : ");
		guest.setMoney(sc.nextInt());
		Thread.sleep(1000);
		if (guest.getMoney() > coffee.getCoffeeMoney()) {
			System.out.println(guest.getMoney() + "�� �޾ҽ��ϴ�.");
			guest.setMoney(guest.getMoney() - coffee.getCoffeeMoney());
			Thread.sleep(1000);
			System.out.println("�Ž������� " + guest.getMoney() + "���Դϴ�.");
		} else {
			System.out.println("�ݾ��� �����մϴ�.");
			System.exit(0);
		}
		Thread.sleep(1000);
	}

	public void order(Barista barista, Guest guest, Coffee coffee) throws InterruptedException {
		payment(guest, coffee);
		barista.make(coffee);

		System.out.println("���� " + coffee.getCoffeeName() + "�� ����� ���Դϴ�.");
		System.out.println("��ø� ��ٷ� �ֽʽÿ�");

		Thread.sleep(10000);

		orderPrint(coffee, guest);
	}

	public void orderPrint(Coffee coffee, Guest guest) {
		System.out.println("�ֹ��Ͻ� " + coffee.getCoffeeName() + " ���Խ��ϴ�.");
	}

}
