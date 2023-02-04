package model;

import java.util.Random;

public class Render {

    protected int width;
    protected int length;

    protected int[][] display = new int[width][length];

    protected boolean isStart = false;

    public Render(int width, int length) {

        this.width = width;
        this.length = length;
    }

    public void setPosition(Object object) {

        Random randomPosition = new Random();

        int col = randomPosition.nextInt(width) + 1;
        int row = randomPosition.nextInt(length) + 1;

    }

    public void renderDisplay() {

        for (int i = 1; i < width; i++) {
            for (int j = 1; j < length; j++) {
                System.out.println(" | ");
            }
            System.out.println(" -- ");
        }
    }
}
