package bridge;

public class QuickSorter extends SortImple {


    public static void quickSort(Integer[] array, int left, int right){
        if(left <= right){
            int p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l ++;
                }
                while (array[r] > p){
                    r --;
                }
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    l++ ;
                    r-- ;
                }
            }
            quickSort(array, left, r);
            quickSort(array, l, right);
        }
    }

	@Override
	public void sort(Integer[] obj) {
		// TODO 自動生成されたメソッド・スタブ
		quickSort(obj, 0, obj.length-1);
		
	}
}
