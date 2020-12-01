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
        Invoker invoker = new Invoker(this);
        new ArrayList<>(Arrays.asList(commands.split("")))
                .forEach(command -> {
                    if (command.equals("M")) {
                        invoker.addComment(new moveCommand());
                    } else if (command.equals("L")) {
                        invoker.addComment(new turnLeftCommand());
                    } else if (command.equals("R")) {
                        invoker.addComment(new turnRightCommand());
                    }
                });
        invoker.executeCommands();
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
