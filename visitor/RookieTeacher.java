package visitor;

import java.util.List;

public class RookieTeacher extends Teacher {
	public RookieTeacher(List<Home> students){
		this.students = students;
	}

	@Override
	public void visit(Home studentHome) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちは");
	}

	@Override
	public void visit(TanakaHome studentHome) {
		// TODO 自動生成されたメソッド・スタブ
		studentHome.praisedChild();
	}

	@Override
	public void visit(SuzukiHome studentHome) {
		// TODO 自動生成されたメソッド・スタブ
		studentHome.reprovedChild();
	}

}
