package prototype;

public class Teacher{
	public Paper[] createManyCrystals(){
		Paper prototype = new Paper("雪の結晶");
		PrototypeKeeper keeper = new PrototypeKeeper();
		keeper.addCloneable("雪の結晶",prototype);
		drawCrystal(prototype);
		cutAccordanceWithLine(prototype);
		
		Paper[] papers = new Paper[100];

		for(int n=0; n<papers.length ; n++){
			papers[n] = (Paper)keeper.getClone("雪の結晶");
		}
		return papers;
	}
	private void drawCrystal(Paper paper){
		// 描いたり消したりしながら、きれいに描くため時間がかかる
	}
	private void cutAccordanceWithLine(Paper paper){
		// 描かれた線に沿ってきれいに切るには時間がかかる
	}
}