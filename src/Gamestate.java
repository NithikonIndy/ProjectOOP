import PlayerandMap.Player;
import PlayerandMap.Map;
import Statement.MoveCommand;
import Statement.ActionCommand;
import Statement.AttackCommand;
import Statement.RegionCommand;
import Statement.InfoExpression;
import PlayerandMap.Time;


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
    private Time time;


    public Gamestate(Map map, ArrayList<Player> players) {
        this.map = map;
        this.players = players;
        this.move=new MoveCommand();
        this.regionCommand=new RegionCommand();
        this.act=new ActionCommand();
        this.attack=new AttackCommand();
        this.infoExpression=new InfoExpression();
        this.p=new Player();
        this.time=new Time();
    }

    public void showlist(){
        System.out.println(getP().getXcityplayerList());
        System.out.println(getP().getYcityplayerList());
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
        return move;
    }

    public AttackCommand getAttack() {
        return attack;
    }

    public InfoExpression getInfoExpression() {
        return infoExpression;
    }

    public RegionCommand getRegionCommand() {
        return regionCommand;
    }

    public boolean GameOver(){
        if (map.getMap(p.getXcitycenter(), p.getYcitycenter())==0){
            return true;
        }else {
            return false;
        }

    }
}
