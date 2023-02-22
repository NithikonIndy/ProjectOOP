/** action done or relocate
 */
public interface ActionCommand extends Command {

    public void Done();
    public void reset();
    public void Relocate(int x,int y);

}
