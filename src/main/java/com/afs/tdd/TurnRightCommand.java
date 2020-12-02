package com.afs.tdd;

public class TurnRightCommand implements Command{
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnRight();
    }
}
