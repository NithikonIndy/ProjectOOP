package model;

public class Inventory {
    protected int IgGCount;
    protected int IgMCount;
    protected int IgACount;
    protected int virusCount;

    public Inventory(int igGCount, int igMCount, int igACount) {
        this.IgGCount = 0;
        this.IgMCount = 0;
        this.IgACount = 0;
    }

    //IgG count
    public void increaseIgG() {
        this.IgGCount++;
    }
    public void decreaseIgG() {
        this.IgGCount--;
    }
    public int getIgG(){
        return IgGCount;
    }
    
    //IgM count
    public void increaseIgM() {
        this.IgMCount++;
    }
    public void decreaseIgM() {
        this.IgMCount--;
    }
    public int getIgM(){
        return IgMCount;
    }
    
    //IgA count
    public void increaseIgA() {
        this.IgACount++;
    }
    public void decreaseIgA() {
        this.IgACount--;
    }
    public int getIgA(){
        return IgACount;
    }
}