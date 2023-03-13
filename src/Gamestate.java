import java.util.ArrayList;

public class Gamestate {
    private Map map;
    private ArrayList<Player> players;
    private Player p;
    private MoveCommand move;
    private ActionCommand act;
    private AttackCommand attack;
    private RegionCommand regionCommand;
    private InfoExpression infoExpression;


    public Gamestate(Map map, ArrayList<Player> players) {
        this.map = map;
        this.players = players;
        this.move=new MoveCommand();
        this.regionCommand=new RegionCommand();
        this.act=new ActionCommand();
        this.attack=new AttackCommand();
        this.infoExpression=new InfoExpression();
        this.p=new Player();
    }

    public void showlist(){
        System.out.println( getP().XcityplayerList);
        System.out.println(getP().YcityplayerList);
    }
    public ActionCommand getAct() {
        return act;
    }

    public Player getP() {
        return p;
    }

    public Map getMap() {
        return map;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public MoveCommand getMove(){
       // move.MoveUp(players.get(0));
        return move;}

    public AttackCommand getAttack() {
        return attack;
    }

    public InfoExpression getInfoExpression() {
        return infoExpression;
    }

    public RegionCommand getRegionCommand() {
        return regionCommand;
    }

//    public boolean isGameOver() {
//        return player.getYplayer() == map.getLength() - 1 && player.getXplayer() == map.getWidth() - 1;
//    }
}
