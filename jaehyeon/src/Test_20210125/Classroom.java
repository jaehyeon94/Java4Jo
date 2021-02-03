package Test_20210125;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Instructor instructor = new Instructor();
		Student student = new Student("aaa");
		Student student1 = new Student("bbb");
		instructor.accept(student);
		instructor.accept(student1);
		int number = 0;
		
		for(int i = 1; i < instructor.getStudents().length; i++) {
			if(instructor.getStudents()[i] == null) {
				number = instructor.getStudents()[i-1].getNo();
				break;
			}
		}
		for(int i = 0; i < number; i++) {
			String s = "안녕 내 이름은 "+instructor.getStudents()[i].getName()+ "이야";
			instructor.getStudents()[number].receiveMessage(s,instructor.getStudents()[i].getName());
		}
		
		
		System.out.println(instructor.getStudents()[number].getReceiveMessage()[1]);
	}

}
