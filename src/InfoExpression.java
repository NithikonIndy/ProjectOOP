/** check nearby  function | opponent expression view space
 */
public class InfoExpression {

    protected int Ycurrent=Player1.YcurrentP1;
    protected int Xcurrent=Player1.XcurrentP1;
    public long[] viewspace (){ // opponent exprssion
        // Y -- initial 1 to 6 and ++ initial 1 to 6
        for(int i=0;i<6;i++){
            int tempY=Ycurrent;
            tempY++;
            if(true){
                // see enemy in direct north
            }
        }
        for(int i=0;i<6;i++){
            int tempY=Ycurrent;
            tempY--;
            if(true){
                // see enemy in direct south
            }
        }
        for(int i=0;i<6;i++){
            int tempX=Xcurrent;
            int tempY=Ycurrent;
            tempY++;
            tempX++;
            if(true){
                // see enemy in direct north-east
            }
        }
        for(int i=0;i<6;i++){
            int tempX=Xcurrent;
            int tempY=Ycurrent;
            tempY--;
            tempX++;
            if(true){
                // see enemy in direct south-east
            }
        }
        for(int i=0;i<6;i++){
            int tempX=Xcurrent;
            int tempY=Ycurrent;
            tempY++;
            tempX--;
            if(true){
                // see enemy in direct north-west
            }
        }
        for(int i=0;i<6;i++){
            int tempX=Xcurrent;
            int tempY=Ycurrent;
            tempY--;
            tempX--;
            if(true){
                // see enemy in direct south-west
            }
        }
        return null;
    }

    public long nearby (){

        return 0;
    }
}
