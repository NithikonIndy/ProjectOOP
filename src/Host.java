package model;

public class Host {

    protected int xAxis;
    protected int yAxis;

    public void move(String direction) {

        switch (direction) {

            case "left"     -> this.xAxis--;
            case "right"    -> this.xAxis++;
            case "up"       -> this.yAxis++;
            case "down"     -> this.yAxis--;

        }

    }


}
