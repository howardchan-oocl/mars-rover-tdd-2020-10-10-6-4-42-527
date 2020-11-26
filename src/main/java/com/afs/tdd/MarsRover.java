package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {

        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        new ArrayList<>(Arrays.asList(commands.split("")))
                .forEach(this::move);
    }

    private void move(String command) {
        if (command.equals("M") && direction.equals("N")) {
            locationY += 1;
        } else if (command.equals("M") && direction.equals("S")) {
            locationY -= 1;
        } else if (command.equals("M") && direction.equals("W")) {
            locationX -= 1;
        } else if (command.equals("M") && direction.equals("E")) {
            locationX += 1;
        }
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }
}
