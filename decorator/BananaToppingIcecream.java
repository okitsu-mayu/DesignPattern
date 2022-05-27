package decorator;

public class BananaToppingIcecream implements Icecream {

	private Icecream ice = null;
	public BananaToppingIcecream(Icecream ice){
		this.ice = ice;
	}
	public String getName(){
		String name = "バナナ";
		name += ice.getName();
		return name;
	}
	public String howSweet(){
		return ice.howSweet();
	}

}
