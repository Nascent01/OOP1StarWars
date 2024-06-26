package command;

import cli.Command;
import universe.Universe;

public class Close implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened()) {
            System.out.println("Open file first!");
        } else if (args.length != 0) {
            System.out.println("Usage: close <file.xml>");
        } else {
            Universe.getInstance().getPlanets().clear();
            Universe.getInstance().getJediPopulation().clear();
            Universe.getInstance().setFileOpened(false);
            System.out.println("Closing file...");
            System.out.println("File closed!");
        }
    }
}
