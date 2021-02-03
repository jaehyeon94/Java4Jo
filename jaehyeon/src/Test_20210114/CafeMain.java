package Test_20210114;

public class CafeMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String coffeeName;
		Cafe cafe = new Cafe();
		Barista barista = new Barista();
		Guest guest = new Guest(10000);

		coffeeName = cafe.menu();
		Coffee coffee = new Coffee(coffeeName);
		cafe.order(barista, guest, coffee);

	}
}
