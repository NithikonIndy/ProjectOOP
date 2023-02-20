/** action done or relocate
 */
public class ActionCommand implements Command {

    protected boolean turn =true;
    public void Done(){
        turn=false;
    }
    public void reset(){
        turn=true;
    }

    public void Relocate(int x,int y){
        Done();
    }

}
