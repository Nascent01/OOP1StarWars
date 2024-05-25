package command;

import cli.Command;
import planet.PlanetManager;
import universe.Universe;

public class AddPlanet implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened()) {
            System.out.println("Open file first!");
        } else if (args.length != 1) {
            System.out.println("Usage: <add_plant> name");
        } else {
            PlanetManager.addPlanet(args);
        }
    }
}
