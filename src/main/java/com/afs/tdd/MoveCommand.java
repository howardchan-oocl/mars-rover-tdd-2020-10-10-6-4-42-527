package com.afs.tdd;

public class MoveCommand implements Command {
    @Override
    //todo private set,get location, add a new method to move
    public void execute(MarsRover marsRover) {
        marsRover.move();
    }
}
