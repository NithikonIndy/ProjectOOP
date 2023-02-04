package model;

public class CellA{
    public Virus virus = null;
    public Antibody antibody = null;
    public Organ organParent = null;   
    public int x = 0;
    public int y = 0;
    
    public CellA(Organ organParent, int x, int y) {
        this.organParent = organParent;
        this.x = x;
        this.y = y;
    } 

    
 }
