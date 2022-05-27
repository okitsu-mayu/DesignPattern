package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Home> list = new ArrayList<Home>();
		SuzukiHome suzuki = new SuzukiHome();
		TanakaHome tanaka = new TanakaHome();
		list.add(suzuki);
		list.add(tanaka);
		
		RookieTeacher rTeacher = new RookieTeacher(list);
		VeteranTeacher vTeacher = new VeteranTeacher(list);
		
		rTeacher.visits();
		vTeacher.visits();
		
	}

}
