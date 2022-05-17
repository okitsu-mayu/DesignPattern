package strategy;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human human1 = new Human("taro", 170, 60, 30);
		Human human2 = new Human("jiro", 172, 60, 23);
		Main main = new Main();
		SampleClass sample = new SampleClass(new AgeComparator());
		int age = sample.compare(human1, human2);
		sample = new SampleClass(new HeightComparator());
		int height = sample.compare(human1, human2);
		System.out.println("age:"+main.getWineer(age,human1,human2));
		System.out.println("height:"+main.getWineer(height,human1,human2));
	}
	
	private String getWineer(int result,Human human1,Human human2) {
		if(result > 0) {
			return human1.name;
		}else if(result < 0) {
			return human2.name;
		}else {
			return "even";
		}
	}

}
