package command;

import cli.Command;
import jedi.JediManager;
import universe.Universe;

public class GetStrongestJedi implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened()) {
            System.out.println("Open file first!");
        } else if (args.length != 1) {
            System.out.println("Usage: get_strongest_jedi <planet_name>");
        } else {
            JediManager.getStrongestJedi(args);
        }
    }
}