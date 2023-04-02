package Statement;

public class IfStatement {
    private boolean condition;

//    public IfStatement(boolean condition){
//        this.condition = condition;
//    }

    public boolean getCondition() {
        return condition;
    }

    public void Todoif(long input){
        if(input>0){
            this.condition=true;
        }else {
            this.condition=false;
        }
    }
}
