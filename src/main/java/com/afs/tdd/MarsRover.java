package com.afs.tdd;

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
        invoker.addCommand(commands);
        invoker.executeCommands();
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

    public void move() {
        if (direction.equals("N")) {
            locationY += 1;
        } else if (direction.equals("S")) {
            locationY -= 1;
        } else if (direction.equals("W")) {
            locationX -= 1;
        } else if (direction.equals("E")) {
            locationX += 1;
        }
    }

    public void turnLeft() {
        if (direction.equals("N")) {
            direction = "W";
        } else if (direction.equals("S")) {
            direction = "E";
        } else if (direction.equals("E")) {
            direction = "N";
        } else if (direction.equals("W")) {
            direction = "S";
        }
    }

    public void turnRight() {
        if (direction.equals("N")) {
            direction = "E";
        } else if (direction.equals("S")) {
            direction = "W";
        } else if (direction.equals("E")) {
            direction = "S";
        } else if (direction.equals("W")) {
            direction = "N";
        }
    }
}

