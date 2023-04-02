import PlayerandMap.Maps;
import PlayerandMap.Player;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean GameStart = false;
        ArrayList<Player> playerList = new ArrayList<>();


        playerList.add(new Player("TT"));
        playerList.add(new Player("HH"));

       while (!GameStart){
           // สร้าง Map และ GameState
           Maps map = new Maps();
           Gamestate gameState = new Gamestate(map, playerList);

           // สุ่มตำแหน่ง Player บน Map
           map.Randomregion(playerList);
           // แสดงผลลัพธ์
           map.Showmap();


           //
         //วางแผน

           while (gameState.getTime().start_intial()>0){

               //gameState.Constructionplans(playerList.get(0));

           }
           GameStart =true;
       }




    }

}