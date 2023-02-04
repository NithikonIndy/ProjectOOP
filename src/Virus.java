package model;

import java.util.LinkedList;
import java.util.Random;

public class Virus {

    public int health;
    public int attack;
    public int type;

    protected int virusCount = 0;

    public boolean isDead = false;
    public CellA parentCell = null;


    public Virus(int type, int health, int attack) {
        this.type = type;
        this.health = health;
        this.attack = attack;
    }
}
