package chain0fResponsibility;

public class ChiefTeacher extends Responsible{ 
    private Level responsibleLevel = new Level(3); 
    public ChiefTeacher(String responsiblePerson){ 
        super(responsiblePerson); 
    }    
    protected boolean beAbleToJudge(Question question){ 
        if(question.level.lessThan(responsibleLevel)){ 
            return true; 
        } 
        return false; 
    } 
    protected void judge(Question question){ 
        System.out.println("解決："+question.question+"by"+super.getResponsiblePerson());
    } 
}