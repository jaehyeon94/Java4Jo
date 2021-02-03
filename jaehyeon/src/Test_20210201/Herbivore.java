package Test_20210201;

public class Herbivore extends Animal {


	public Herbivore(String name, int age, int weight) {
		super(name, age, weight);
		// TODO Auto-generated constructor stub
	}

	public void printHerbivore() {
		
		if(super.getName().equals("하마") || super.getName().equals("코끼리")) {
			System.out.println(super.getName() + "은(는) 초식동물입니다.");
		} else {
			System.out.println("초식 동물이 아닙니다.");
		}
	}
}
