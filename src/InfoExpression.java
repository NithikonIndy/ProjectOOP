import java.util.ArrayList;
import java.util.Collections;

/** check nearby  function | opponent expression view space
 */
public class InfoExpression implements Command{

    protected int Xcitycenter;
    protected int Ycitycenter;
    protected int Xplayer;
    protected int Yplayer;

    /** view for Player
     */

    public long viewspace(Player player,Map map) {// opponent exprssion
        Xplayer = player.getXplayer();
        Yplayer =player.getYplayer();
        ArrayList<Long> index = new ArrayList<Long>();
        // up
        for (int i=0;i<6;i++){
            int Xcheck=Xplayer;
            int Ycheck=Yplayer;
            if(Ycheck>0 && Ycheck <19){
                Ycheck--;
            }
            long check=map.getMap(Xcheck,Ycheck);
//            for (int k=0;k< player.XcityplayerList.size();k++){
//                if(player.XcityplayerList.get(k)==){
//
//                }
//            }
            if(check>0){
                index.add(Long.valueOf((10*(i+1))+1));
            }


        }
        // upright
        for (int i=0;i<6;i++){
            int Xcheck=Xplayer;
            int Ycheck=Yplayer;
            if(Ycheck>0 && Ycheck <19){
                Ycheck--;
            }
            if(Xcheck<14 && Xcheck >0){
                Xcheck++;
            }
            long check=map.getMap(Xcheck,Ycheck);
            if(check>0){
                index.add(Long.valueOf((10*(i+1))+2));
            }

        }
        // downright
        for (int i=0;i<6;i++){
            int Xcheck=Xplayer;
            int Ycheck=Yplayer;
            if(Ycheck>0 && Ycheck <19){
                Ycheck++;
            }
            if(Xcheck<14 && Xcheck >0){
                Xcheck++;
            }
            long check=map.getMap(Xcheck,Ycheck);

            if(check>0){
                index.add(Long.valueOf((10*(i+1))+3));
            }

        }
        // down
        for (int i=0;i<6;i++){
            int Xcheck=Xplayer;
            int Ycheck=Yplayer;
            if(Ycheck>0 && Ycheck <19){
                Ycheck++;
            }
            long check=map.getMap(Xcheck,Ycheck);

            if(check>0){
                index.add(Long.valueOf((10*(i+1))+4));
            }

        }
        // downleft
        for (int i=0;i<6;i++){
            int Xcheck=Xplayer;
            int Ycheck=Yplayer;
            if(Ycheck>0 && Ycheck <19){
                Ycheck++;
            }
            if(Xcheck<14 && Xcheck >0){
                Xcheck--;
            }
            long check=map.getMap(Xcheck,Ycheck);

            if(check>0){
                index.add(Long.valueOf((10*(i+1))+5));
            }

        }
        // upleft
        for (int i=0;i<6;i++){
            int Xcheck=Xplayer;
            int Ycheck=Yplayer;
            if(Ycheck>0 && Ycheck <19){
                Ycheck--;
            }
            if(Xcheck<14 && Xcheck >0){
                Xcheck--;
            }
            long check=map.getMap(Xcheck,Ycheck);

            if(check>0){
                index.add(Long.valueOf((10*(i+1))+6));
            }

        }


        if(index.size()==0){
            index.add(Long.valueOf(0));
        }
        long mincheck = Collections.min(index);


        return mincheck;
    }


    public long nearby(Player player,Map map){
        ArrayList <Long> listnearby=new ArrayList<Long>();
        Xplayer=player.getXplayer();
        Yplayer= player.getYplayer();
        int Xcheck=Xplayer;
        int Ycheck=Yplayer;
        boolean checkprocess=false;

        //up
        if(Ycheck<19 && Ycheck>0){ // y intial 0-20
            Ycheck--;
            checkprocess=true;
        }
        listnearby.add(onedirectnearby(map,Ycheck,Xcheck));
        if(checkprocess==true){
            Ycheck++;
            checkprocess=false;
        }

        //upright
        if(Ycheck<19 && Ycheck>0 && Xcheck < 14 && Xcheck >0){ // y intial 0-20 and x intail 0-20
            Ycheck--;
            Xcheck++;
            checkprocess=true;
        }
        listnearby.add(onedirectnearby(map,Ycheck,Xcheck));
        if(checkprocess==true){
            Ycheck++;
            Xcheck--;
            checkprocess=false;
        }

        //downright
        if(Ycheck<19 && Ycheck>0 && Xcheck < 14 && Xcheck >0){ // y intial 0-20 and x intail 0-20
            Ycheck++;
            Xcheck++;
            checkprocess=true;
        }
        listnearby.add(onedirectnearby(map,Ycheck,Xcheck));
        if(checkprocess==true){
            Ycheck--;
            Xcheck--;
            checkprocess=false;
        }

        //down
        if(Ycheck<19 && Ycheck>0){ // y intial 0-20
            Ycheck++;
            checkprocess=true;
        }
        listnearby.add(onedirectnearby(map,Ycheck,Xcheck));
        if(checkprocess==true){
            Ycheck--;
            checkprocess=false;
        }

        //downleft
        if(Ycheck<19 && Ycheck>0 && Xcheck < 14 && Xcheck >0){ // y intial 0-20 and x intail 0-20
            Ycheck++;
            Xcheck--;
            checkprocess=true;
        }
        listnearby.add(onedirectnearby(map,Ycheck,Xcheck));
        if(checkprocess==true){
            Ycheck--;
            Xcheck++;
            checkprocess=false;
        }

        //upleft
        if(Ycheck<19 && Ycheck>0 && Xcheck < 14 && Xcheck >0){ // y intial 0-20 and x intail 0-20
            Ycheck--;
            Xcheck--;
            checkprocess=true;
        }
        listnearby.add(onedirectnearby(map,Ycheck,Xcheck));
        if(checkprocess==true){
            --Ycheck;
            --Xcheck;
            checkprocess=false;
        }

        if(listnearby.size()==0){
            listnearby.add(0L);
        }

        long mincheck = Collections.min(listnearby);

        return mincheck;
    }

    public long onedirectnearby(Map map,int xposition,int yposition){
        long checknearby = map.getMap(xposition,yposition);
        long near=0;
        if(checknearby!=0){
            long x=1;  //x =distance player until destionation
            long y=countdigital(checknearby); //y=digitalnumber
            near=100*x+y;
        }
        return near;
    }

    public long countdigital(long number){
        long count=0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

//    public static void main(String[] args){
//
//
//    }
}
