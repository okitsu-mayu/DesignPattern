package facade;

import java.util.HashMap;
import java.util.Map;

public class LendingList {
	private static Map<String,Boolean> lendingList = new HashMap<>();
	static {
		lendingList.put("昆虫図鑑", false);
		lendingList.put("小説", true);
    }

	public boolean check(String bookName) {
		return lendingList.get(bookName);
	}

}
