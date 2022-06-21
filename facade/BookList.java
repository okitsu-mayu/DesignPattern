package facade;

import java.util.HashMap;
import java.util.Map;

public class BookList {
	
	private static Map<String,String> bookMap = new HashMap<String,String>();
	static {
		bookMap.put("昆虫図鑑", "右の棚");
		bookMap.put("小説", "左の棚");
    }


	public String searchBook(String bookName) {
		
		return bookMap.get(bookName);
	}

}
