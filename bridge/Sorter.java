package bridge;

public class Sorter{ 
    private SortImple sortImple; 
    public Sorter(SortImple sortImple){ 
        this.sortImple = sortImple; 
    } 
    public void sort(Integer[] obj){ 
        sortImple.sort(obj); 
    } 
}