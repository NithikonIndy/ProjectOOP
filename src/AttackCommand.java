/** attack player by shoot
 */
public class AttackCommand implements Command{
    protected long budgetplayer;
    public long getBudget() {
        return budgetplayer;
    }

    public void setBudget(int budgetplayer) {
        this.budgetplayer = budgetplayer;
    }
    public void attack(Player player,Map map,int money,int x,int y){
        if(player.getInit_budget()>=0){
            budgetplayer=player.getInit_budget();
            map.players[y][x]-=money;
            budgetplayer--;
            player.setInit_budget(budgetplayer);
        }else {

        }
    }
}
