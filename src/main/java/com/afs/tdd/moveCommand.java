package com.afs.tdd;

public class moveCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        if (marsRover.getDirection().equals("N")) {
            marsRover.setLocationY(marsRover.getLocationY() + 1);
        } else if (marsRover.getDirection().equals("S")) {
            marsRover.setLocationY(marsRover.getLocationY() - 1);
        } else if (marsRover.getDirection().equals("W")) {
            marsRover.setLocationX(marsRover.getLocationX() - 1);
        } else if (marsRover.getDirection().equals("E")) {
            marsRover.setLocationX(marsRover.getLocationX() + 1);
        }
    }
}
