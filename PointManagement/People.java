package PointManagement;

public class People {

	protected int no;
	private String id;
	protected String password;
	
	public People(int no, String id) {
		this.no = no;
		this.id = id;
	}
	
	public People(String id) {
		this.id = id;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
