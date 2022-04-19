package training3.iterator;
public class NewVeteranStudentList extends NewStudentList implements Aggregate{

	public Iterator iterator(){
		return new NewVeteranStudentList(this);
	}
    
}