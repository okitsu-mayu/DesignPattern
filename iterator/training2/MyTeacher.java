package training2.iterator;

import iterator.Student;
import iterator.StudentList;

public class MyTeacher extends Teacher{
    private StudentList MyStudentList;
    public MyTeacher(){}
    public void createStudentList(){
        this.studentList = new StudentList(5);
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
