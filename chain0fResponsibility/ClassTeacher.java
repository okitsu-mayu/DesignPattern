package chain0fResponsibility;

public class ClassTeacher extends Responsible{ 
    private Level responsibleLevel = new Level(2); 
    public ClassTeacher(String responsiblePerson){ 
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
