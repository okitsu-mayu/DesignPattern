package builder;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Builder builder = new SaltWaterBuilder(); 
		Director dir = new Director( builder ); 
		dir.constract(); 
		SaltWater saltWater = (SaltWater)builder.getResult();
		System.out.println("塩："+saltWater.salt);
		builder = new SugerWaterBuilder(); 
		dir = new Director( builder ); 
		dir.constract(); 
		SugerWater sugerWater = (SugerWater)builder.getResult();
		System.out.println("砂糖："+sugerWater.suger);
	}

}
