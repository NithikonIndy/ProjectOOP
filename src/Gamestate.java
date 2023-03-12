import java.util.List;

public class Gamestate {
    protected List<Map> areas;
    protected Time timeManager ;
    private final boolean DEBUG = true;


//    public static void Gamestart(){
//        waitState(5);
//    }
//
//    private void waitState(int time){
//        try{
//            for(int i = 1 ; i <= time ; i++) {
//                // ทำ if หรือ switch ทำการเลือกใช้ว่ามันทำอะไรอยู่
//                if(timeManager.inputType.equals("slowdown")){
//                    Thread.sleep((int)(1000*timeManager.slowDownMultiplier));
//                    if(DEBUG) System.out.println("current time "+(i*(int)(1000*timeManager.slowDownMultiplier))/1000.0+ " second");
//                }
//                else if(timeManager.inputType.equals("fastforward")) {
//                    Thread.sleep((int)(1000*timeManager.fastForwardMuliplier));
//                    if(DEBUG) System.out.println("current time "+(i*(int)(1000*timeManager.fastForwardMuliplier))/1000.0+ " second");
//                }
//                else{
//                    Thread.sleep((int)(1000*0.125));
//                    if(DEBUG) System.out.println("current time "+i+ " second");
//                }
//
//
//            }
//        }catch (InterruptedException ex){
//            ex.printStackTrace();
//        }
//    }

    public static void main(String[] args) {



    }
}