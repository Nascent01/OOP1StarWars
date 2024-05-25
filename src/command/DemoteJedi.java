package command;

import cli.Command;
import jedi.JediManager;
import universe.Universe;

public class DemoteJedi implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened())
        {
            System.out.println("Open file first!");
        } else if (args.length != 2) {
            System.out.println("Usage: demote_jedi <jedi_name> <multiplier>");
        } else {
            JediManager.demoteJedi(args);
        }
    }
}
