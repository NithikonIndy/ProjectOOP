/** act move ,  up | down | upleft | upright | downleft | downright
 */
public class MoveCommand implements Command{
    ActionCommand act=new ActionCommand();
    protected int Yplayer;
    protected int Xplayer;
    protected long budget;

    public int getYplayer() {
        return Yplayer;
    }
    public int getXplayer(){
        return Xplayer;
    }
    public long getBudget(){
        return budget;
    }
    public void setYplayer(int Yplayer){
        this.Yplayer=Yplayer;
    }

    public void setXplayer(int Xplayer) {
        this.Xplayer = Xplayer;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public void MoveUp() {
        if(budget>0){
            Yplayer--;
            budget--;
        }else {
            act.Done();
        }

    }

    public void MoveUpLeft() {
        if(budget>0){
            Yplayer--;
            Xplayer--;
            budget--;
        }else {
            act.Done();
        }

    }


    public void MoveUpRight() {
        if(budget>0){
            Yplayer--;
            Xplayer++;
            budget--;
        }else {
            act.Done();
        }

    }


    public void MoveDown() {
        if(budget>0){
            Yplayer++;
            budget--;
        }else {
            act.Done();
        }

    }


    public void MoveDownLeft() {
        if(budget>0){
            Yplayer++;
            Xplayer--;
            budget--;
        }else {
            act.Done();
        }

    }


    public void MoveDownRight() {
        if(budget>0){
            Yplayer++;
            Xplayer++;
            budget--;
        }else {
            act.Done();
        }
    }
}
