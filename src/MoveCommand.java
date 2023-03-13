/** act move ,  up | down | upleft | upright | downleft | downright
 */
public class MoveCommand implements Command{
    ActionCommand act=new ActionCommand();
    protected int Yplayer;
    protected int Xplayer;
    protected long budgetplayer;

    public int getYplayer() {
        return Yplayer;
    }
    public int getXplayer(){
        return Xplayer;
    }
    public long getBudget(){
        return budgetplayer;
    }
    public void setYplayer(int Yplayer){
        this.Yplayer=Yplayer;
    }

    public void setXplayer(int Xplayer) {
        this.Xplayer = Xplayer;
    }

    public void setBudget(long budgetplayer) {
        this.budgetplayer = budgetplayer;
    }


    public void MoveUp(Player player) {
        if(player.getInit_budget()>0 && (player.getYplayer()>0 )){
            Yplayer=player.getYplayer()-1;
            budgetplayer=player.getInit_budget()-1;
            player.setYplayer(Yplayer);
            player.setInit_budget(budgetplayer);
//            Yplayer--;
//            budget--;
        }else {
            act.Done(player);
        }
    }

    public void MoveUpLeft(Player player) {
        if(player.getInit_budget()>0 && (player.getYplayer()>0 && player.getXplayer()<14)){
            Yplayer=player.getYplayer()-1;
            Xplayer=player.getXplayer()-1;
            budgetplayer=player.getInit_budget()-1;
            player.setYplayer(Yplayer);
            player.setXplayer(Xplayer);
            player.setInit_budget(budgetplayer);
//            player.Yplayer--;
//            player.Xplayer--;
//            budget--;
        }else {
            act.Done(player);
        }

    }


    public void MoveUpRight(Player player) {
        if(player.getInit_budget()>0 && (player.getYplayer()>0 && player.getXplayer()>0)){
            Yplayer=player.getYplayer()-1;
            Xplayer=player.getXplayer()+1;
            budgetplayer=player.getInit_budget()-1;
            player.setYplayer(Yplayer);
            player.setXplayer(Xplayer);
            player.setInit_budget(budgetplayer);

//            player.Yplayer--;
//            player.Xplayer++;
//            budget--;
        }else {
            act.Done(player);
        }

    }


    public void MoveDown(Player player) {
        if(player.getInit_budget()>0 && (player.getYplayer()<19)){
            Yplayer=player.getYplayer()+1;
            budgetplayer=player.getInit_budget()-1;
            player.setYplayer(Yplayer);
            player.setInit_budget(budgetplayer);
//            player.Yplayer++;
//            budget--;
        }else {
            act.Done(player);
        }

    }


    public void MoveDownLeft(Player player) {
        if(player.getInit_budget()>0 && (player.getYplayer()<19 && player.getXplayer()>0)){
            Yplayer=player.getYplayer()+1;
            Xplayer=player.getXplayer()-1;
            budgetplayer=player.getInit_budget()-1;
            player.setYplayer(Yplayer);
            player.setXplayer(Xplayer);
            player.setInit_budget(budgetplayer);
//            player.Yplayer++;
//            player.Xplayer--;
//            budget--;
        }else {
            act.Done(player);
        }

    }


    public void MoveDownRight(Player player) {
        if(player.getInit_budget()>0 && (player.getYplayer()<19 && player.getXplayer()<14)){
            Yplayer=player.getYplayer()+1;
            Xplayer=player.getXplayer()+1;
            budgetplayer=player.getInit_budget()-1;
            player.setYplayer(Yplayer);
            player.setXplayer(Xplayer);
            player.setInit_budget(budgetplayer);
//            player.Yplayer++;
//            player.Xplayer++;
//            budget--;
        }else {
            act.Done(player);
        }
    }


}
