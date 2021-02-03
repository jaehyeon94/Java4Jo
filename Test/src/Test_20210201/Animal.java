package Test_20210201;

public class Animal {

	private String name;
	private int age;
	private int Weight;
	private boolean eatMeats;
	
	
	public Animal(String name, int age, int weight, boolean eatMeats) {
		super();
		this.name = name;
		this.age = age;
		this.Weight = weight;
		this.eatMeats = eatMeats;
	}
	
	public Animal(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.Weight = weight;
		this.eatMeats = false;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	
	public boolean isEatMeats() {
		return eatMeats;
	}
	public void setEatMeats(boolean eatMeats) {
		this.eatMeats = eatMeats;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", Weight=" + Weight + "]";
	}
	
	
	
}
