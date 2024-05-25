package command;

import cli.Command;
import planet.PlanetManager;
import universe.Universe;

import java.util.Arrays;

public class PlanetName implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened()) {
            System.out.println("Open file first!");
        } else if (args.length != 2) {
            System.out.println("Usage: <planet_name> <planet_name> ");
        } else {
            PlanetManager.getJediInhabitantsInPlanets(args);
        }
    }
}