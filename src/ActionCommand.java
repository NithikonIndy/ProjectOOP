/** action done or relocate
 */
public class ActionCommand implements Command {
    protected int countturn;
    protected boolean turn;

    public int getCountturn() {
        return countturn;
    }

    public void setCountturn(int countturn) {
        this.countturn = countturn;
    }

    public void Done() {
        turn= true;
        countturn++;
    }

    public void reset() {
        turn=false;
    }


    public void Relocate(int x,int y,int Xcitycenter,int Ycitycenter,long budget ,long display[][]) {
        int shortpath= (int) Math.sqrt((Math.pow(Xcitycenter-x,2) + Math.pow(Ycitycenter-y,2)));
        int cost= 5 *shortpath+10;
        budget-=cost;
        display [x][y]= display  [Ycitycenter][Xcitycenter];
        display [Ycitycenter][Xcitycenter] =0;
        Ycitycenter=y;
        Xcitycenter=x;
        Done();
    }

}
