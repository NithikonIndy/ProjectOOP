/** create player and player should be have budget , city center , count turn
 */

public class Player {

    boolean turn;
    int countturn=1;


    protected long init_budget;
    protected int Xcitycenter;
    protected int Ycitycenter;
    protected int Xplayer;
    protected int Yplayer;
    protected long [][]citycenter;


    public Player(){

    }
    public void createplayer (){
        init_budget=Config.init_budget;
        Map map=new Map();
        int []temp=map.Randomregion();
        Xcitycenter=temp[0];
        Ycitycenter=temp[1];
        Xplayer=temp[0];
        Yplayer=temp[1];
        citycenter [Ycitycenter][Xcitycenter]= Config.init_center_dep; //create city center and initial deposit
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


    public void setturn(boolean turn){ turn=this.turn; }

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
        System.out.println(Ycitycenter+ "   "+Xcitycenter);
    }

}
