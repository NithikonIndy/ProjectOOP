package model;

public class CreateAntibody {

    public static String [] antiBodyTypes = {
        "antibody1",
        "antibody2",
        "antibody3"
    };

    public static void createAntibody() {
    
        int x;
        int y;
        int organId;
    
        while (true) {
            organId = Main.random.nextInt(6);
            int maxX = Main.organs[organId].humanDimention.xAxis;
            int maxY = Main.organs[organId].humanDimention.yAxis;
    
            x = Main.random.nextInt(maxX);
            y = Main.random.nextInt(maxY);
    
            // check available cell.
            if (Main.organs[organId].cells[x][y].antibody == null && Main.organs[organId].cells[x][y].virus == null)
                break;
        }
    
        int type = Main.random.nextInt(3);
    
        int health = 0;
        int attack = 0;
    
        if(Main.shop.buyCheck(antiBodyTypes[type])){
            System.out.println("Not enought credit!!!");
            return;
        }
        
        switch (type) {
            case 0:
                health = 20;
                attack = 5;
                Main.shop.buyAntibody1();
                break;
    
            case 1:
                health = 25;
                attack = 10;
                Main.shop.buyAntibody2();
                break;
    
            case 2:
                health = 30;
                attack = 15;
                Main.shop.buyAntibody3();
                break;
        }
    
        Antibody antibody = new Antibody(type, health, attack);
    
        Main.antibodyList.add(antibody);
        Main.organs[organId].cells[x][y].antibody = antibody;
        antibody.parentCell = Main.organs[organId].cells[x][y];
    
        System.out.println(
                "Antibody type=" + type + " organID=" + organId + " ;health=" + health + " ;attack=" + attack
                        + " ;HumandimentionX=" + x + " ;HumandimentionY=" + y + "\n");
    }
    
}
