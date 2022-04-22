package iterator.training3;

import java.util.Vector;

import iterator.Aggregate;
import iterator.Iterator;
import iterator.NewStudentList;
import iterator.Student;

public class NewVeteranStudentList extends NewStudentList implements Aggregate{

	public NewVeteranStudentList(){
		students = new Vector<Student>();
	}
	
	public Iterator iterator(){
		return new NewVeteranStudentListIterator(this);
	}

	public int size() {
		return this.students.size();
	}
    
}