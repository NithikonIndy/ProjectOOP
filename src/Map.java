/** create map m*n , random city crew ,count turn and create deposit of region
 */

import java.util.Random;
public class Map {
    protected int width =15; // n=15 , columns
    protected int length=20; //m=20 , rows
    protected int[][] display =new int [width][length];

    public Map (){}


    public void randomregion (){
        Random rand = new Random();
        int colum = rand.nextInt(width)+1;
        int rows = rand.nextInt(length)+1;
    }

    public void createmap(){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" -- ");
            }
            System.out.println();
        }
    }
}
