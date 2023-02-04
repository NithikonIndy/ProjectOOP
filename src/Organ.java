package model;

public class Organ {
    public static int heart = 0;
    public static int lung = 1;
    public static int kidney = 2;
    public static int liver = 3;
    public static int stomach = 4;
    public static int brain = 5;

    public int organType = 0;
    public HumanDimention humanDimention = null; 
    public CellA [][] cells = null;
    
    public Organ(int organType) {
        this.organType = organType;
        this.humanDimention = new HumanDimention();
        this.cells = new CellA [humanDimention.xAxis()][humanDimention.yAxis()];

        for(int x=0; x<humanDimention.xAxis; x++){
            for(int y=0; y<humanDimention.yAxis; y++){
                CellA cell = new CellA(this,x,y);
                cells[x][y] = cell;
            }
        }
    }

}
