package training3.iterator;
public class NewVeteranStudentListIterator implements Iterator{
    private NewVeteranStudentLis newVeteranStudentLis;
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
        Student s =  newVeteranStudentList.getStudentAt(index);
        index++;
        return s;
    }
}