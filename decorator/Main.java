package decorator;

public class Main {
	public static void main(String args[]){
		Icecream ice1 = new CashewNutsToppingIcecream(new VanillaIcecream());
		Icecream ice2 = new CashewNutsToppingIcecream(new GreenTeaIcecream());
		Icecream ice3 = new BananaToppingIcecream(new CashewNutsToppingIcecream(new VanillaIcecream()));
		Icecream ice4 = new BananaToppingIcecream(ice2);
		System.out.println(ice1.getName());
		System.out.println(ice2.getName());
		System.out.println(ice3.getName());
		System.out.println(ice4.getName());
	}
}
