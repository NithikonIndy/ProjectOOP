package Statement;

import ConfigFile.Config;
import PlayerandMap.Maps;
import PlayerandMap.Player;

/** invest region | collect region and Interest rates deposit of region
 */
public class RegionCommand {
    int Xplayer;
    int Yplayer;
    long budgetplayer;
    private ActionCommand act;

    public RegionCommand(){
        this.act=new ActionCommand();
    }

    public int getYplayer() {
        return Yplayer;
    }

    public int getXplayer() {
        return Xplayer;
    }

    public long getBudget() {
        return budgetplayer;
    }

    public void setYplayer(int yplayer) {
        Yplayer = yplayer;
    }

    public void setXplayer(int xplayer) {
        Xplayer = xplayer;
    }

    public void setBudget(long budget) {
        this.budgetplayer = budget;
    }

    public void invest(long moneyinvest, Player player, Maps map) {
        if(moneyinvest>=Config.max_dep){
           act.Done(player);
        }else {
            Yplayer=player.getYplayer();
            Xplayer=player.getXplayer();
            map.setMap(Xplayer,Yplayer,moneyinvest);
            player.getXcityplayerList().add(Xplayer);
            player.getYcityplayerList().add(Yplayer);
           // player.cityplayerList.add(map.getMap(Xplayer,Yplayer)); // อนาเขตplayer
            budgetplayer= player.getInit_budget();
            budgetplayer-=moneyinvest;
//            setXplayer();
//            setYplayer();
            setBudget(budgetplayer);
            System.out.println(player.getYcityplayerList()+""+player.getYcityplayerList());
        }
        act.Done(player);
    }

    public void collect(Player player,long withdraw,Maps map) {
        if(map.getMap(player.getXplayer(),player.getYplayer()) < withdraw){
            act.Done(player);
        }else {
            Yplayer=player.getYplayer();
            Xplayer=player.getXplayer();
            long money = map.getMap(player.getXplayer(),player.getYplayer()) - withdraw;
            map.setMap(Xplayer,Yplayer,money);
            budgetplayer= player.getInit_budget();
            budgetplayer+=withdraw;
            if (map.getMap(player.getXplayer(),player.getYplayer()) <= 0){
                map.setMap(Xplayer,Yplayer,0);
            }

        }
        act.Done(player);
    }

}
