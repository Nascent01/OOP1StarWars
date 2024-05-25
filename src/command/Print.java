package command;

import cli.Command;
import planet.PlanetManager;
import universe.Universe;

public class Print implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened()) {
            System.out.println("Open file first!");
        } else if (args.length != 1) {
            System.out.println("Usage: print <planet_name>, print jedi_name>");
        } else {
            PlanetManager.printInfo(args);
        }
    }
}