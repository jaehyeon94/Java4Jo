package Test_20210201;

public class Carnivore extends Animal {

	

	public Carnivore(String name, int age, int weight) {
		super(name, age, weight);
		// TODO Auto-generated constructor stub
	}

	public void printCarnivore() {
		
		if(super.getName().equals("����") || super.getName().equals("ȣ����") || super.getName().equals("ġŸ") || super.getName().equals("����") ) {
			System.out.println(super.getName() + "��(��) ���ĵ��� �Դϴ�.");
		} else {
			System.out.println("���� ������ �ƴմϴ�.");
		}
		
	}
}
