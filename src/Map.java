/** create map m*n , random city crew ,create deposit of region
 */

import java.util.Random;
public class Map {
    protected int width =specialvariable.n; // n=15 , columns y
    protected int length=specialvariable.m; //m=20 , rows x
    protected int[][] display =new int [length][width];

    public int[] randomregion (){
        Random rand = new Random();
        int colum = rand.nextInt(width)+1;
        int rows = rand.nextInt(length)+1;
        return new int[] {colum, rows};
    }

    public void createmap(){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" -- ");
            }
            System.out.println();
        }
    }
}
