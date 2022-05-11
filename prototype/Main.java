package prototype;

public class Main {

	public static void main(String[] args) {
		long oldStart = System.currentTimeMillis();
		TeacherOld old = new TeacherOld();
		old.createManyCrystals();
		long oldEnd = System.currentTimeMillis();
		
		long newStart = System.currentTimeMillis();
		Teacher newTeacher = new Teacher();
		newTeacher.createManyCrystals();
		long newEnd = System.currentTimeMillis();
		
		System.out.println("old:"+oldEnd+"."+oldStart);
		System.out.println("new:"+newEnd+"."+newStart);
	}

}
