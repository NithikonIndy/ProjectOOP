package model;

public class HumanDimention {
    public int xAxis;
    public int yAxis;

    public HumanDimention(){
        this.xAxis = 0;
        this.yAxis = 0;
    }

    public int xAxis(){
        this.xAxis = 10;
        return xAxis;
    }

    public int yAxis(){
        this.yAxis = 10;
        return yAxis;
    }
}
