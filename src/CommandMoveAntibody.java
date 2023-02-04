package model;

public class CommandMoveAntibody {

    public static void antibodyMoveCommand() {
    
        while (true) {
            int randMove;
    
            int antibodyLength = Main.antibodyList.size();
            int antibodyIndex = Main.random.nextInt(antibodyLength);
            Antibody antibody = Main.antibodyList.get(antibodyIndex);
            CellA cell = antibody.parentCell;
            int x = cell.x;
            int y = cell.y;
            int x1 = x;
            int y1 = y;
            int organId = cell.organParent.organType;
    
            randMove = Main.random.nextInt(8);
    
            if (randMove == 1) {// 0
                x1 += 1;
                y1 += 0;
            } else if (randMove == 2) {// 45
                x1 += 1;
                y1 += 1;
            } else if (randMove == 3) {// 90
                x1 += 0;
                y1 += 1;
            } else if (randMove == 4) {// 125
                x1 -= 1;
                y1 += 1;
            } else if (randMove == 5) {// 180
                x1 -= 1;
                y1 += 0;
            } else if (randMove == 6) {// 225
                x1 -= 1;
                y1 -= 1;
            } else if (randMove == 7) {// 270
                x1 += 0;
                y1 -= 1;
            } else if (randMove == 8) {// 315
                x1 += 1;
                y1 -= 1;
            }
    
            if (CommandMoveVirus.checkCanMove(randMove, organId, x, y, x1, y1)) {
                Main.organs[organId].cells[x][y].antibody = null;
                Main.organs[organId].cells[x1][y1].antibody = antibody;
                antibody.parentCell = Main.organs[organId].cells[x1][y1];
                System.out.println("antibody index=" + antibodyIndex + " randmove=" + randMove + " organid="
                        + organId + "move from location=" + x + " , " + y + " to location=" + x1 + " , " + y1);
                break;
            }
        }
    }
    
}
