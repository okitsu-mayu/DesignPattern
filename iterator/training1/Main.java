package iterator.training1;
import iterator.Teacher;


public class Main{
	public static void main(String args[]){
		Teacher you = new MyTeacher();
		you.createStudentList();
		you.callStudents();
	}
}