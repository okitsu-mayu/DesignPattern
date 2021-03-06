package iterator.training1;

import iterator.Student;
import iterator.StudentList;
import iterator.Teacher;

public class MyTeacher extends Teacher{
    private StudentList studentList;
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
        for(int i=0;i<this.studentList.getLastNum();i++){
            Student student = this.studentList.getStudentAt(i);
            String sex = null;
            if(student.getSex() == 1){
                sex = "男";
            }else{
                sex = "女";
            }
            System.out.println(student.getName()+"　"+sex);
        }
    };
}
