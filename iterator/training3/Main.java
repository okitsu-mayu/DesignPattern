package iterator.training3;
import iterator.Teacher;


public class Main{
	public static void main(String args[]){
		Teacher you = new VeteranTeacher();
		you.createStudentList();
		you.callStudents();
	}
}