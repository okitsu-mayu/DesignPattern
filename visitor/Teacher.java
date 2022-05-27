package visitor;

import java.util.List;

public abstract class Teacher {
	List<? extends Home> students = null;
	public abstract void visit(Home studentHome);
	public abstract void visit(TanakaHome studentHome);
	public abstract void visit(SuzukiHome studentHome);
	public List<? extends Home> getStudentList(){
		return students;
	}
	public void visits() {
		students.forEach(student ->
		 student.accept(this)
				);
	}
}
