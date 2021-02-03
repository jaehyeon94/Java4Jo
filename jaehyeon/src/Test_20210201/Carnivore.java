package Test_20210201;

public class Carnivore extends Animal {

	

	public Carnivore(String name, int age, int weight) {
		super(name, age, weight);
		// TODO Auto-generated constructor stub
	}

	public void printCarnivore() {
		
		if(super.getName().equals("사자") || super.getName().equals("호랑이") || super.getName().equals("치타") || super.getName().equals("늑대") ) {
			System.out.println(super.getName() + "은(는) 육식동물 입니다.");
		} else {
			System.out.println("육식 동물이 아닙니다.");
		}
		
	}
}
