package bridge;

public class BubbleSorter extends SortImple {


	@Override
	public void sort(Integer[] obj) {
		// TODO 自動生成されたメソッド・スタブ
        Integer temp;
        for(int i = 0; i < obj.length; i++){
            for(int j = 0; j< obj.length -i -1; j ++){
                if( obj[j] <  obj[j + 1]){
                    temp = obj[j];
                    obj[j] = obj[j + 1];
                    obj[j + 1] = temp;
                }
            }
        }
	}

}
