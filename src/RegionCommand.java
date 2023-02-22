/** invest region | collect region and Interest rates deposit of region
 */
public interface RegionCommand extends Command {

    void invest(long moneyinvest);
    void collect(long withdraw);
}
