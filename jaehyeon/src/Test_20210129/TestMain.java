package Test_20210129;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("�̸�", "�ּ�", "��ȭ��ȣ");
		Customer customer = new Customer("�մ�", "�մ� �ּ�", "�մ� ��ȭ��ȣ", 1, 1000);

		Person per = new Customer("�մ�", "�մ��ּ�", "�մ���ȭ��ȣ", 2, 10000);

		System.out.println(person.toString());
		System.out.println(customer.toString());
		System.out.println(per.toString());

	}
}
