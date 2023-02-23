/** create map m*n , random city crew ,create deposit of region
 */
import java.util.Arrays;
import java.util.Random;
public class Map {
    protected int width =Sampleconfigurationfile.n; // n=15 , columns X
    protected int length=Sampleconfigurationfile.m; //m=20 , rows Y
    protected long[][] display =new long [length][width];

    public int[] Randomregion (){
        Random rand = new Random();
        int colum = rand.nextInt(width); //X
        int rows = rand.nextInt(length); //Y
        return new int[] {colum, rows};
    }

    public void Showmap(){
        for (int i = 0; i < length; i++) {
           System.out.println(Arrays.toString(display[i]));
        }


    }
}
