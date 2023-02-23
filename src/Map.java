/** create map m*n , random city crew ,create deposit of region
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
public class Map {

    LinkedList <Player> player;

    protected int width =Config.n; // n=15 , columns X
    protected int length=Config.m; //m=20 , rows Y
    protected long[][] display =new long [length][width];

    public int[] Randomregion (){
        Random rand = new Random();
        int colum = rand.nextInt(width);
        int rows = rand.nextInt(length);
        return new int[] {colum, rows};
    }

    public void Showmap(){
        for (int i = 0; i < length; i++) {
           System.out.println(Arrays.toString(display[i]));
        }
    }

    public void AddPlayer(Player p){
        this.player.add(p);
    }

    public void RemovePlayer(Player p){
        this.player.remove(p);
    }

}
