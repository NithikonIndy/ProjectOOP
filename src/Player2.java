/** create player1 and player 2 should be have budget , city center, count turn
 */
public class Player2 extends Time{
    protected int turnP2;
    protected long init_budgetP2;
    static int XcurrentP2;
    static int YcurrentP2;
    protected long [][]centercity =new long[specialvariable.n][specialvariable.m] ;
    public void createplayer (){
        init_budgetP2=specialvariable.init_budget;
        Map map=new Map();
        int []temp=map.randomregion();
        YcurrentP2=temp[0];
        XcurrentP2=temp[1];
        centercity [YcurrentP2][XcurrentP2]= specialvariable.init_center_dep; //create city center and initial deposit


    }
}
