package Statement;

import PlayerandMap.Player;

import java.util.Map;

public interface Statement  {
   // double evaluate(Map<String, Integer> map, Player player);

    boolean evaluate(Map<String, Integer> map, Player player);
}
