package model;

import java.util.LinkedList;

public class Antibody extends Host{

    public int type;
    public int health;
    public int attack;
    public int price;

    protected int antibodyCount = 0;

    public static boolean isDead = false;

    public CellA parentCell = null;

    LinkedList<Object> antibodyList = new LinkedList<>();

    public Antibody(int type ,int health, int attack) {
        
        this.type = type;
        this.health = health;
        this.attack = attack;
    }
}
