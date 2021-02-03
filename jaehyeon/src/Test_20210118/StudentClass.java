package Test_20210118;

import java.util.ArrayList;

public class StudentClass {
	ArrayList<Student> student;
	Student[] students;

	StudentClass(ArrayList<Student> student) {
		this.student = student;
	}

	StudentClass(Student[] students) {
		this.students = students;
	}

	void nameShow() {
		System.out.print("이름 : ");
		for (int i = 0; i < student.size(); i++) {
			System.out.print(student.get(i).name + " ");
		}
		System.out.println("");
	}

	void scoreShow() {
		System.out.print("점수 : ");
		for (int i = 0; i < student.size(); i++) {
			System.out.print(student.get(i).score + " ");
		}
		System.out.println("");
	}
}
