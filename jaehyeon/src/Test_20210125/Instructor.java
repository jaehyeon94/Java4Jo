package Test_20210125;

public class Instructor {

	private Student[] students = new Student[10];
	
	
	
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	public void accept(Student student) {
		for(int i = 0; i < this.students.length; i++ ) {
			if(students[i] == null) {
				students[i] = student;
				students[i].setNo(i);
				break;
			}
		}
		introduce();
	}
	private void introduce() {
		for(int i = 0; i < this.students.length; i++) {
			if(students[i] == null) {
				System.out.println("�ȳ��ϼ���. ���� �� " + this.students[(i-1)].getName()+"�Դϴ�.");
				break;
			}
		}
	}
	
}
