package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Invoker {
    private final MarsRover marsRover;
    private List<Command> commands = new ArrayList<>();

    public Invoker(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void addCommand(String commands) {
        Arrays.asList(commands.split("")).stream()
                .forEach(command -> {
                    if (command.equals("M")) {
                        this.commands.add(new MoveCommand());
                    } else if (command.equals("L")) {
                        this.commands.add(new TurnLeftCommand());
                    } else if (command.equals("R")) {
                        this.commands.add(new TurnRightCommand());
                    }
                });
    }

    public void executeCommands() {
        commands.forEach(command -> command.execute(this.marsRover));
    }
}
