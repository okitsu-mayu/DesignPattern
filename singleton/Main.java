package singleton;

public class Main {

	public static void main(String[] args) {
		RegisterNote registerNote = RegisterNote.getInstance();
		registerNote.returnResult("インスタンス取得");
	}

}
