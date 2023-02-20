/** create player and player should be have budget , city center , count turn
 */
import java.util.Arrays;
public class Player extends ActionCommand{

    protected long init_budget;
    protected int Xcurrent;
    protected int Ycurrent;
    protected long [][]centercity =new long[Sampleconfigurationfile.n][Sampleconfigurationfile.m] ;

    public Player(){

    }
    public void createplayer (){
        init_budget=Sampleconfigurationfile.init_budget;
        Map map=new Map();
        int []temp=map.Randomregion();
        Ycurrent=temp[0];
        Xcurrent=temp[1];
        centercity [Ycurrent][Xcurrent]= Sampleconfigurationfile.init_center_dep; //create city center and initial deposit
    }

    public void show(){
        System.out.println(Xcurrent+ "   "+Ycurrent);
    }


    @Override
    public void Done() {

        super.Done();
    }

    @Override
    public void Relocate(int x,int y) {
        int shortpath= (int) Math.sqrt((Math.pow(Xcurrent-x,2) + Math.pow(Ycurrent-y,2)));
        int cost= 5 *shortpath+10;
        init_budget-=cost;
        centercity[x][y]= centercity [Ycurrent][Xcurrent];
        centercity [Ycurrent][Xcurrent] =0;
        Ycurrent=y;
        Xcurrent=x;
        System.out.println(init_budget);
        super.Relocate(x,y);
    }
}
