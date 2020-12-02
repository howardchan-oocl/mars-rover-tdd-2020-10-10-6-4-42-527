package com.afs.tdd;

public class TurnLeftCommand implements Command{
    @Override
    public void execute(MarsRover marsRover) {
        if (marsRover.getDirection().equals("N")) {
            marsRover.setDirection("W");
        } else if (marsRover.getDirection().equals("S")) {
            marsRover.setDirection("E");
        } else if (marsRover.getDirection().equals("E")) {
            marsRover.setDirection("N");
        } else if (marsRover.getDirection().equals("W")) {
            marsRover.setDirection("S");
        }
    }
}
