package iterator.training2;

import iterator.Iterator;
import iterator.Student;
import iterator.Teacher;

public class MyTeacher extends Teacher{
    private MyStudentList studentList;
    public MyTeacher(){}
    public void createStudentList(){
        this.studentList = new MyStudentList(5);
		this.studentList.add(new Student("赤井亮太",1));
		this.studentList.add(new Student("赤羽里美",2));
		this.studentList.add(new Student("岡田美央",2));
		this.studentList.add(new Student("西森俊介",1));
		this.studentList.add(new Student("中ノ森玲菜",2));
    };
    public void callStudents(){
	    Iterator itr = studentList.iterator();
	    while(itr.hasNext()){
		    System.out.println(((Student)itr.next()).getName());
	    }
    }
}
