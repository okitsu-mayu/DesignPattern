package prototype;

public class TeacherOld {
	public Paper[] createManyCrystals(){
		Paper[] papers = new Paper[100];
		for(int n=0; n<papers.length ; n++){
			papers[n] = new Paper();
			drawCrystal(papers[n]);  // 時間がかかる
			cutAccordanceWithLine(papers[n]); // 時間がかかる
		}
		return papers;
	}
	private void drawCrystal(Paper paper){
		// きれいに描くため時間がかかる
		paper.setName("雪の結晶");
	}
	private void cutAccordanceWithLine(Paper paper){
		// 描かれた線に沿ってきれいに切るには時間がかかる
		System.out.println(paper.getName());
	}
}
