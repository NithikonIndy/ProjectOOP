/** create player and player should be have budget , city center , count turn
 */
import java.util.Arrays;
public class Player implements ActionCommand,MoveCommand,RegionCommand,InfoExpression,Time{

    boolean turn;
    int countturn=1;
    Map map=new Map();
    protected long init_budget;
    protected int Xcitycenter;
    protected int Ycitycenter;
    protected int Xplayer;
    protected int Yplayer;


    public Player(){

    }
    public void createplayer (){
        init_budget=Sampleconfigurationfile.init_budget;
        int []temp=map.Randomregion();
        Ycitycenter=temp[0];
        Xcitycenter=temp[1];
        Yplayer=temp[0];
        Xplayer=temp[1];
        map.display [Ycitycenter][Xcitycenter]= Sampleconfigurationfile.init_center_dep; //create city center and initial deposit
    }

    public void show(){
        System.out.println(Xcitycenter+ "   "+Ycitycenter);
    }
    @Override
    public void Done() {
        turn= true;

        countturn++;
    }
    @Override
    public void reset() {
        turn=false;
    }

    @Override
    public void Relocate(int x,int y) {
        int shortpath= (int) Math.sqrt((Math.pow(Xcitycenter-x,2) + Math.pow(Ycitycenter-y,2)));
        int cost= 5 *shortpath+10;
        init_budget-=cost;
        map.display [x][y]= map.display  [Ycitycenter][Xcitycenter];
        map.display [Ycitycenter][Xcitycenter] =0;
        Ycitycenter=y;
        Xcitycenter=x;
        Done();
    }

    @Override
    public void MoveUp() {
        Yplayer--;
        init_budget--;
    }

    @Override
    public void MoveUpLeft() {
        Yplayer--;
        Xplayer--;
        init_budget--;
    }

    @Override
    public void MoveUpRight() {
        Yplayer--;
        Xplayer++;
        init_budget--;
    }

    @Override
    public void MoveDown() {
        Yplayer++;
        init_budget--;
    }

    @Override
    public void MoveDownLeft() {
        Yplayer++;
        Xplayer--;
        init_budget--;
    }

    @Override
    public void MoveDownRight() {
        Yplayer++;
        Xplayer++;
        init_budget--;
    }

    @Override
    public void invest(long moneyinvest) {
        map.display[Yplayer][Xplayer]=moneyinvest;


    }

    @Override
    public void collect(long withdraw) {
        map.display[Yplayer][Xplayer]=-withdraw;
    }

    /**
     * view for Player
     */
    @Override
    public long[] viewspace() {
        return new long[0];
    }
}
