package visitor;

import java.util.List;

public class VeteranTeacher extends Teacher {
	public VeteranTeacher(List<Home> students){
		this.students = students;
	}

	@Override
	public void visit(Home studentHome) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちは!!");
	}

	@Override
	public void visit(TanakaHome studentHome) {
		// TODO 自動生成されたメソッド・スタブ
		studentHome.reprovedChild();
	}

	@Override
	public void visit(SuzukiHome studentHome) {
		// TODO 自動生成されたメソッド・スタブ
		studentHome.praisedChild();		
	}

}
