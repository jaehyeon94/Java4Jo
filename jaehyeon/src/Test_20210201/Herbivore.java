package Test_20210201;

public class Herbivore extends Animal {


	public Herbivore(String name, int age, int weight) {
		super(name, age, weight);
		// TODO Auto-generated constructor stub
	}

	public void printHerbivore() {
		
		if(super.getName().equals("�ϸ�") || super.getName().equals("�ڳ���")) {
			System.out.println(super.getName() + "��(��) �ʽĵ����Դϴ�.");
		} else {
			System.out.println("�ʽ� ������ �ƴմϴ�.");
		}
	}
}
