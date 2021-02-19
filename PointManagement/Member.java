package PointManagement;

public class Member extends People {

	

	private int point;
	private int age;
	private String name;
	
	
	public Member(int no, String id,String password ,String name, int age) {
		super(no, id);
		this.point = 100;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
