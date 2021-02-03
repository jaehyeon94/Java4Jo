package Test_20210129;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("이름", "주소", "전화번호");
		Customer customer = new Customer("손님", "손님 주소", "손님 전화번호", 1, 1000);

		Person per = new Customer("손님", "손님주소", "손님전화번호", 2, 10000);

		System.out.println(person.toString());
		System.out.println(customer.toString());
		System.out.println(per.toString());

	}
}
