/** invest region | collect region and Interest rates deposit of region
 */
public class RegionCommand implements Command {
    ActionCommand act=new ActionCommand();
    int Xplayer;
    int Yplayer;
    long display[][];
    long budget;

    public void invest(long moneyinvest) {
        if(moneyinvest>=Config.max_dep){
           act.Done();
        }else {
            display[Yplayer][Xplayer]=moneyinvest;
            budget-=moneyinvest;
        }
    }


    public void collect(long withdraw) {
        if(display[Yplayer][Xplayer]>withdraw){
            act.Done();
        }else {
            display[Yplayer][Xplayer]=-withdraw;
            budget+=withdraw;
        }
    }
}
