package model;

public class CommandAttack {

    public static void attackCommand(int organId, int x, int y) {
    
        boolean isDead = false;
    
        for (int checkMove = 1; checkMove <= 8; checkMove++) {
            int x1 = x;
            int y1 = y;
    
            if (checkMove == 1) {// 0
                x1 += 1;
                y1 += 0;
            } else if (checkMove == 2) {// 45
                x1 += 1;
                y1 += 1;
            } else if (checkMove == 3) {// 90
                x1 += 0;
                y1 += 1;
            } else if (checkMove == 4) {// 125
                x1 -= 1;
                y1 += 1;
            } else if (checkMove == 5) {// 180
                x1 -= 1;
                y1 += 0;
            } else if (checkMove == 6) {// 225
                x1 -= 1;
                y1 -= 1;
            } else if (checkMove == 7) {// 270
                x1 += 0;
                y1 -= 1;
            } else if (checkMove == 8) {// 315
                x1 += 1;
                y1 -= 1;
            }
    
            System.out.println("attackCommand organId=" + organId + " x=" + x + " y=" + y + " x1=" + x1 + " y1=" + y1);
            if (CommandAttack.checkCanAttack(organId, x1, y1)) {
    
                System.out.println("attackCommand0 organId=" + organId + " x=" + x + " y=" + y + " x1=" + x1 + " y1=" + y1);
                CellA cell0 = Main.organs[organId].cells[x][y];
                CellA cell1 = Main.organs[organId].cells[x1][y1];
    
                int health0 = 0;
                int health1 = 0;
                int attack0 = 0;
                int attack1 = 1;
    
                int healthVirusBefore = 0;
                int healthVirusAfter = 0;
                int healthAntibodyBefore = 0;
                int healthAntibodyhAfter = 0;
    
                // organId x,y attack x1, y1 health before=.. after=..
    
                if (cell0.virus != null) {
                    health0 = cell0.virus.health;                    
                    attack0 = cell0.virus.attack;
                } else {
                    health0 = cell0.antibody.health;
                    attack0 = cell0.antibody.attack;
                }
    
                if (cell1.virus != null) {
    
                    healthVirusBefore = cell1.virus.health;
                    cell1.virus.health -= attack0;
                    healthVirusAfter = cell1.virus.health;
    
                    isDead = cell1.virus.health <= 0 ? true : false;
                    Main.shop.initialAntibodyCredit += 200;
    
                    if (isDead) {
                        Main.organs[organId].cells[x1][y1].virus = null;
                        Main.virusList.remove(cell1.virus);
                    }
                } else {
                    healthAntibodyBefore = cell1.antibody.health;
                    cell1.antibody.health -= attack0;
                    healthAntibodyhAfter = cell1.antibody.health;
    
                    isDead = cell1.antibody.health <= 0 ? true : false;
                    if (isDead) {
                        Main.organs[organId].cells[x1][y1].antibody = null;
                        Main.antibodyList.remove(cell1.antibody);
                    }
                }
                System.out.println("organID=" + organId + " x=" + x + " y=" + y + " attack=" + attack0 + " x1=" + x1 + " y1="
                        + y1 + " isDead=" + isDead + "\n");
                System.out.println("health antibody before=" + healthAntibodyBefore + " health antibody after="
                        + healthAntibodyhAfter +
                        " health virus before=" + healthVirusBefore + " health virus after=" + healthVirusAfter
                        + "\n\n");
    
                break;
            }
        }
    }

    public static boolean checkCanAttack(int organId, int x, int y) {
    
        System.out.println("checkCanAttack orgainId=" + organId + " x=" + x + " y=" + y);
        if (x >= 0 && x < Main.organs[organId].humanDimention.xAxis &&
                y >= 0 && y < Main.organs[organId].humanDimention.yAxis &&
                (Main.organs[organId].cells[x][y].virus != null || Main.organs[organId].cells[x][y].antibody != null)) {
    
            boolean virunNotNull = Main.organs[organId].cells[x][y].virus != null;
            boolean antiBodyNotNull = Main.organs[organId].cells[x][y].antibody != null;
    
            System.out.println(
                    "checkCanAttack return true virusNotNull=" + virunNotNull + " antiBodyNotNull=" + antiBodyNotNull);
            return true;
        }
        System.out.println("checkCanAttack return false");
        return false;
    }
    
}
