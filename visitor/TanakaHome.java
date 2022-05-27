package visitor;

public class TanakaHome extends Home implements TeacherAcceptor{
	public Object praisedChild(){
		System.out.println("お茶をどうぞ");
		return new Tea();
	}
	public Object reprovedChild(){
		System.out.println("こらー！");

		return null;
	}
	/**
	 * 訪問者を受け入れるメソッド
	 */
	public void accept(Teacher teacher){
		teacher.visit(this);
	} 

}
