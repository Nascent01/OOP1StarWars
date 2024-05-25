package command;

import cli.Command;
import jedi.JediManager;
import universe.Universe;

public class CreateJedi implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened()) {
            System.out.println("You must open a file first");
        } else if (args.length != 6) {
            System.out.println("Usage: create_jedi <planet_name> <jedi_name> <jedi_rank> <jedi_age> <saber_color> <jedi_strength>");
        } else {
            JediManager.createJedi(args);
        }
    }
}
