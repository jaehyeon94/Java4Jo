package Test_20210114;

public class Barista {

	Barista() {
	}

	void make(Coffee coffee) {
		if (coffee.getCoffeeName().equals("�Ƹ޸�ī��")) {
			coffee.setWater(true);
			coffee.setBeans(true);
		} else if (coffee.getCoffeeName().equals("ī���")) {
			coffee.setMilk(true);
			coffee.setBeans(true);
		} else if (coffee.getCoffeeName().equals("�ٴҶ��")) {
			coffee.setBeans(true);
			coffee.setMilk(true);
			coffee.setSyrup(true);
		} else if (coffee.getCoffeeName().equals("ī���ī")) {
			coffee.setBeans(true);
			coffee.setMilk(true);
			coffee.setSyrup(true);
			coffee.setCinnamon(true);
		}
	}
}
