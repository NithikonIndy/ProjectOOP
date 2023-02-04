package model;

public class CreateVirus {

    public static void createVirus() {
    
        int x;
        int y;
        int organId;
    
        while (true) {
            organId = Main.random.nextInt(6);
            int maxX = Main.organs[organId].humanDimention.xAxis;
            int maxY = Main.organs[organId].humanDimention.yAxis;
    
            x = Main.random.nextInt(maxX);
            y = Main.random.nextInt(maxY);
    
            // check avalible cell.
            if (Main.organs[organId].cells[x][y].antibody == null && Main.organs[organId].cells[x][y].virus == null)
                break;
        }
    
        int type = Main.random.nextInt(3);
    
        int health = 0;
        int attack = 0;
    
        switch (type) {
            case 0:
                health = 20;
                attack = 5;
                break;
    
            case 1:
                health = 25;
                attack = 10;
                break;
    
            case 2:
                health = 30;
                attack = 15;
                break;
        }
    
        Virus virus = new Virus(type, health, attack);
    
        Main.virusList.add(virus);
        Main.organs[organId].cells[x][y].virus = virus;
        virus.parentCell = Main.organs[organId].cells[x][y];
    
        System.out.println(
                "Virus type=" + type + " organID=" + organId + " health=" + health + " attack=" + attack
                        + " HumandimentionX=" + x + " HumandimentionY=" + y);
    }
    
}
