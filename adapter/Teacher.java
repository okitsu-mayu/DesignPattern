package adapter;

import adapter.training1.NewTaro;

public class Teacher{
	public static void main(String args[]){
		Chairperson chairperson = new NewTaro();
		chairperson.organizeClass();
	}
}