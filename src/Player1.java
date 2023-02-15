/** create player1 and player 1 should be have budget , city center , count turn
 */
import java.util.Arrays;
public class Player1 extends Time{
    protected int turnP1;
    protected long init_budgetP1;
    static int XcurrentP1;
    static int YcurrentP1;
    protected long [][]centercity =new long[specialvariable.n][specialvariable.m] ;
    public void createplayer (){
        init_budgetP1=specialvariable.init_budget;
        Map map=new Map();
        int []temp=map.randomregion();
        YcurrentP1=temp[0];
        XcurrentP1=temp[1];
        centercity [YcurrentP1][XcurrentP1]= specialvariable.init_center_dep; //create city center and initial deposit


    }
    public void show(){
        //System.out.println(  centercity [Ycurrent][Xcurrent]);
    }

}
