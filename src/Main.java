public class Main {
    static boolean isStart ;
    public static void main(String[] args) {

        while (!isStart){

            Player p1=new Player();
            p1.createplayer();
            if(p1.init_budget<=0){
                isStart =true;
            }

        }






    }
}