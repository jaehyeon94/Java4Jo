package Test_20210114;

public class Barista {

	Barista() {
	}

	void make(Coffee coffee) {
		if (coffee.getCoffeeName().equals("아메리카노")) {
			coffee.setWater(true);
			coffee.setBeans(true);
		} else if (coffee.getCoffeeName().equals("카페라떼")) {
			coffee.setMilk(true);
			coffee.setBeans(true);
		} else if (coffee.getCoffeeName().equals("바닐라라떼")) {
			coffee.setBeans(true);
			coffee.setMilk(true);
			coffee.setSyrup(true);
		} else if (coffee.getCoffeeName().equals("카페모카")) {
			coffee.setBeans(true);
			coffee.setMilk(true);
			coffee.setSyrup(true);
			coffee.setCinnamon(true);
		}
	}
}
