import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class MainTest {

    @Test
    void main() {
        ArrayList<Player> playerList = new ArrayList<>();
        playerList.add(new Player("TT"));
        playerList.add(new Player("HH"));
        playerList.add(new Player("ss"));
        Map map = new Map();
        Gamestate gameState = new Gamestate(map, playerList);
        map.AddPlayer(playerList.get(0),9,9);
        map.Showmap();
       // gameState.getMove().MoveUp(playerList.get(0));
        gameState.getMove().MoveUp(playerList.get(0));
        gameState.getRegionCommand().invest(100,playerList.get(0),map);
        gameState.getMove().MoveDown(playerList.get(0));

        gameState.getMove().MoveUpLeft(playerList.get(0));
        gameState.getRegionCommand().invest(100,playerList.get(0),map);
        gameState.getMove().MoveDownRight(playerList.get(0));

        gameState.getMove().MoveUpRight(playerList.get(0));
        gameState.getRegionCommand().invest(100,playerList.get(0),map);
        gameState.getMove().MoveDownLeft(playerList.get(0));

        gameState.getMove().MoveDown(playerList.get(0));
        gameState.getRegionCommand().invest(100,playerList.get(0),map);
        gameState.getMove().MoveUp(playerList.get(0));

        gameState.getMove().MoveDownLeft(playerList.get(0));
        gameState.getRegionCommand().invest(100,playerList.get(0),map);
        gameState.getMove().MoveUpRight(playerList.get(0));

        gameState.getMove().MoveDownRight(playerList.get(0));
        gameState.getRegionCommand().invest(100,playerList.get(0),map);
        gameState.getMove().MoveUpLeft(playerList.get(0));

        //map.AddPlayer(playerList.get(1),10,9);
        //map.AddPlayer(playerList.get(1),10,8);
        map.Showmap();
        Assertions.assertEquals(0,gameState.getInfoExpression().viewspace(playerList.get(0),map));
        Assertions.assertEquals(0,gameState.getInfoExpression().nearby(playerList.get(0),map));

    }
}