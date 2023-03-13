import java.util.ArrayList;

public class Main {
//    public List<Map> areas;
//    protected List<Player> p;
//    protected Time timeManager ;
//    private final boolean DEBUG = true;


    public static void main(String[] args) {
        ArrayList<Player> playerList = new ArrayList<>();
        playerList.add(new Player("TT"));
        playerList.add(new Player("HH"));

        // สร้าง Map และ GameState
        Map map = new Map();
        Gamestate gameState = new Gamestate(map, playerList);

        // สุ่มตำแหน่ง Player บน Map
        map.Randomregion(playerList);

        // แสดงผลลัพธ์
        map.Showmap();
        gameState.getMove().MoveUp(playerList.get(0));
        gameState.getRegionCommand().invest(100,playerList.get(0),map);
        System.out.println("-------------------------------------------------");
        map.Showmap();
       // gameState.showlist();
       // System.out.println(gameState.getInfoExpression().viewspace(playerList.get(0),map));



//
//        map.Showmap();
//        gameState.getAttack().attack(playerList.get(0),map,20,1,1);







    }

}