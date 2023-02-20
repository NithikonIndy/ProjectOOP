public class Main {
    static boolean isStart;
    public static void main(String[] args) {

        while (isStart){

        }
        Map map=new Map();
        map.Createmap();
        Player p1=new Player();
        p1.createplayer();
        p1.show();
        p1.Relocate(10,10);
        p1.show();
    }


}