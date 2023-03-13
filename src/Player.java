import java.util.ArrayList;
import java.util.Map;

/** create player and player should be have budget , city center , count turn
 */

public class Player {

    ArrayList<Integer> XcityplayerList=new ArrayList<>();
    ArrayList<Integer> YcityplayerList=new ArrayList<>();

    private boolean Alive;

    protected String name;
    boolean turn;
    int countturn=1;
    protected long init_budget;
    protected int Xcitycenter;
    protected int Ycitycenter;
    protected int Xplayer;
    protected int Yplayer;
    private Map map;
    private RegionCommand regionCommand;

    public Player(){

    }
    public Player(String name){
        this.name=name;
        this.init_budget=Config.init_budget;
        this.regionCommand=new RegionCommand();
    }

    public String getName() {
        return name;
    }
    public boolean getturn(){
        return this.turn;
    }

    public long getInit_budget(){
        return this.init_budget;
    }
    public int getXcitycenter(){
        return this.Xcitycenter;
    }
    public int getYcitycenter(){
        return this.Ycitycenter;
    }
    public  int getXplayer(){
        return this.Xplayer;
    }
    public int getYplayer(){ return this.Yplayer; }
    public int getCountturn(){
        return this.countturn;
    }

    public void setName(String name) {this.name = name;}

    public void setturn(boolean turn){ this.turn=turn; }

    public void setInit_budget(long bugget){
        this.init_budget=bugget;
    }
    public void setXcitycenter(int Xcitycenter){
        this.Xcitycenter=Xcitycenter;
    }
    public void setYcitycenter(int Ycitycenter){
        this.Ycitycenter=Ycitycenter;
    }
    public void setXplayer(int Xplayer){
        this.Xplayer=Xplayer;
    }
    public void setYplayer(int Yplayer){
        this.Yplayer=Yplayer;
    }
    public void setCountturn(int countturn){
        this.countturn=countturn;
    }

    public void show(){
        System.out.println(++Ycitycenter + "   "+ ++Xcitycenter);
    }
    public void showplayerlist(){

        for (int i=0;i<XcityplayerList.size();i++){
            System.out.println(XcityplayerList.get(i));
            System.out.println(YcityplayerList.get(i));
            System.out.println("t" +
                    "");
        }
    }







}
