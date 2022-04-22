package iterator.training3;

import iterator.Iterator;
import iterator.Student;

public class NewVeteranStudentListIterator implements Iterator{
    private NewVeteranStudentList newVeteranStudentList;
    private int index;
    public NewVeteranStudentListIterator(NewVeteranStudentList list){
        this.newVeteranStudentList = list;
        this.index = 0;
    }
    public boolean hasNext(){
        if(newVeteranStudentList.size() > index){
            return true;
        }else{
            return false;
        }
    }
    public Object next(){
        Student s =  newVeteranStudentList.getStudentAd(index);
        index++;
        return s;
    }
}