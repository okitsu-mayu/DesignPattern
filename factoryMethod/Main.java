package factoryMethod;

public class Main{
	public static void main(String args[]){
		CutPrint cutPrint = new ImagawasCutPrint();
        cutPrint.createCutPrint();
	}
}