package com.afs.tdd;

public class turnRightCommand implements Command{
    @Override
    public void execute(MarsRover marsRover) {
        if (marsRover.getDirection().equals("N")) {
            marsRover.setDirection("E");
        } else if (marsRover.getDirection().equals("S")) {
            marsRover.setDirection("W");
        } else if (marsRover.getDirection().equals("E")) {
            marsRover.setDirection("S");
        } else if (marsRover.getDirection().equals("W")) {
            marsRover.setDirection("N");
        }
    }
}
