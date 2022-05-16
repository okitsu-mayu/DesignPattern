package bridge;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TimerSorter qSorter = new TimerSorter(new QuickSorter());
		Integer[] obj =  {1,4,7,15,157,23,16,73,3456,654,246,2357,7642,5765,2245,764,2354,77543,24572,34553,234567,35,34,2467,144,2365,3456,23563,1353,436,77345,6345,2645,246,2};
		qSorter.timerSort(obj);
		
		TimerSorter bSorter = new TimerSorter(new BubbleSorter());
		bSorter.timerSort(obj);
	}

}
