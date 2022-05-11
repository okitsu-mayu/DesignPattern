package prototype;

public class Paper implements Cloneable{
	private String name;
	public Paper(){}
	public Paper(String name){
		this.setName(name);
	}
	public Cloneable createClone(){
		Paper newPaper = new Paper();
		newPaper.setName(this.getName());
		// newPaper と this を重ねて、this の形に切り抜く
		System.out.println(newPaper.getName());
		return newPaper;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}