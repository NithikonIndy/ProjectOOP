/** create map m*n , random city crew ,create deposit of region
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Map {
    protected long [][] players;
    protected int width =Config.n; // n=15 , columns X
    protected int length=Config.m; //m=20 , rows Y
    public Map(){
        players = new long[length][width];
    }
    public void Randomregion (ArrayList<Player> playerList){
        Random random = new Random();
        for (Player player : playerList) {
            int x, y;
            do {
                x = random.nextInt(width);
                y = random.nextInt(length);
            } while (players[y][x] != 0); // ตรวจสอบว่าตำแหน่งนี้ว่างหรือไม่
            AddPlayer(player, y, x);
        }
    }

    public void Showmap(){
        for (int i = 0; i < length; i++) {
           System.out.println(Arrays.toString(players[i]));
        }
    }

    public void AddPlayer(Player p,int y,int x){
        //players[x][y] = p;
        p.XcityplayerList.add(x);
        p.YcityplayerList.add(y);
        p.setXcitycenter(x);
        p.setYcitycenter(y);
        p.setXplayer(x);
        p.setYplayer(y);
        players[y][x]=Config.init_center_dep;
        p.show();
        System.out.println(p.YcityplayerList +""+ p.XcityplayerList);

        //p.cityplayerList.add(getMap(x,y));
    }

//    public void DepositInterest(int turn,Player player){
//        players[]
//    }

    public void setMap(int x, int y,long map) {
        this.players[y][x] = map;
    }

    public long getMap(int x, int y) {
        return players[y][x];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }




//    public void RemovePlayer(Player p){
//        this.p.remove(p);
//    }


}

