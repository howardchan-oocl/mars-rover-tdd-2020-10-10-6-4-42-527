package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final MarsRover marsRover;
    private List<Command> commands = new ArrayList<>();

    public Invoker(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void addComment(Command command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        commands.forEach(command -> command.execute(this.marsRover));
    }
}
