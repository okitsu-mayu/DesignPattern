package iterator.training2;

import iterator.Aggregate;
import iterator.Iterator;
import iterator.StudentList;

public class MyStudentList extends StudentList implements Aggregate{
	public MyStudentList(){
		super();
	}
	public MyStudentList(int studentCount){
		super(studentCount);
	}

	public Iterator iterator(){
		return new MyStudentListIterator(this);
	}
    
}