package Test_20210118;

import java.util.ArrayList;
import java.util.Random;

public class StudentMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> student = new ArrayList<Student>();
		String[] names = { "김", "이", "박", "권", "홍", "최", "정", "임", "서", "강" };
		Random random = new Random();

		for (int i = 0; i < random.nextInt(30); i++) {
			student.add(new Student(names[random.nextInt(10)], random.nextInt(100)));
		}

		StudentClass studentClass = new StudentClass(student);

		studentClass.nameShow();
		studentClass.scoreShow();

	}

}
