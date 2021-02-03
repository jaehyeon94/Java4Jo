package Test_20210201;

public class Zoo {

	private Animal[] animals;
	
	public Zoo(Animal[] animals) {
		this.animals = animals;
	}
	
	
	public void printCarnivore() {
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i].isEatMeats()) {
				System.out.println(animals[i].getName() + "은(는) 육식 동물입니다.");
			}
		}
		
		
	}
	public void printHerbivore() {
		
		for(int i = 0; i < animals.length; i++) {
			if(!animals[i].isEatMeats()) {
				System.out.println(animals[i].getName() + "은(는) 초식 동물입니다.");
			}
		}
		
	}
	
	
	
}

