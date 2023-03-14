package Statement;
import PlayerandMap.Map;
import PlayerandMap.Player;
/** attack player by shoot
 */
public class AttackCommand implements Command{

    private ActionCommand act;
    protected long budgetplayer;
    public long getBudget() {
        return budgetplayer;
    }

    public void setBudget(int budgetplayer) {
        this.budgetplayer = budgetplayer;
    }

    public AttackCommand(){
        this.act=new ActionCommand();
    }
    public void attack(Player player,Map map,int money,int x,int y){
        if(player.getInit_budget()>=0){
            budgetplayer=player.getInit_budget();
            long sub= map.getMap(x,y)-money;
            map.setMap(x,y,sub);
           // map.players[y][x]-=money;
            budgetplayer--;
            player.setInit_budget(budgetplayer);
        }else {

        }
    }
}
