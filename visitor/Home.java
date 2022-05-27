package visitor;

public abstract class Home{
	public abstract Object praisedChild();
	public abstract Object reprovedChild();
	public abstract void accept(Teacher teacher);
}