package model;

import java.io.*;
import java.util.*;


public class Main {

    public static Organ[] organs = null;
    public static LinkedList<Virus> virusList = new LinkedList<Virus>();
    public static LinkedList<Antibody> antibodyList = new LinkedList<Antibody>();
    public static Random random = new Random();
    public static Shop shop = new Shop();

    public static void main(String[] args) throws IOException {
        CarinConfig properties = new CarinConfig();
        properties.getPropValues();

        shop.initialAntibodyCredit = CarinConfig.initialAntibodyCredit;

        organs = new Organ[6];

        for (int i = 0; i < 6; i++) {
            organs[i] = new Organ(i);
        }

        while (true) {
            try {
                Thread.sleep(1100L);
                CreateVirus.createVirus();
                CreateAntibody.createAntibody();
                CommandMoveVirus.virusMoveCommand();
                CommandMoveAntibody.antibodyMoveCommand();

                int virusLength = virusList.size();
                int virusIndex = random.nextInt(virusLength);
                Virus virus = virusList.get(virusIndex);
                CellA cell = virus.parentCell;
                int organId = cell.organParent.organType;
                int x = cell.x;
                int y = cell.y;
                boolean isCellVirusNull = cell.virus==null;
                System.out.println("call attackCommand virusIndex=" + virusIndex + " organId=" + organId + " x=" + x + " y=" + y + " isCellVirusNull=" + isCellVirusNull);
                CommandAttack.attackCommand(organId, x, y);
/*
output.json
[[0,0,0,0,0,0,0,3,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,11,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0]]

*/
                String output ="";

                String comma0 = "";
                for (int n=0;n<6;n++){
                    output +=" [";
                    for(int i=0;i<organs[n].humanDimention.xAxis;i++){
                        output += comma0 + "[";
                        comma0 = ",";
                        String comma1 = "";
                        for(int j=0;j<organs[n].humanDimention.yAxis;j++){
                            int value = 0;
                            if (organs[n].cells[i][j].virus!=null){
                                value = organs[n].cells[i][j].virus.type + 1;
                            }else if(organs[n].cells[i][j].antibody!=null){
                                value = organs[n].cells[i][j].antibody.type + 11;                
                            }else{
                                value = 0;
                            }
                            output += comma1 + value;
                            comma1 = ",";
                        }
                        output += "]\n";
                    }
                    output += "]\n";
                    break;
                }

                //String fileName0  = "C:\Users\Lenovo\Desktop\carin1\carin\Spring\src\main\frontend\public\output.js";
                //String fileName = "C:/\Users/\Lenovo/\Desktop/\carin1/\carin/\Spring/\src/\main/\frontend\public\output.js";
                //D:\limnthework\261200 oop\carin\Spring\src\main\frontend\public\output.js

                String fileName = "D:" + "//";
                fileName += "limnthework" + "//";
                fileName += "261200 oop" + "//";
                fileName += "carin" + "//";
                fileName += "Spring" + "//";
                fileName += "src" + "//";
                fileName += "main" + "//";
                fileName += "frontend" + "//";
                fileName += "public" + "//";
                fileName += "output.json";

                PrintWriter out = new PrintWriter(fileName);

                out.println(output);
                out.close();

                System.out.println(output);
            
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
