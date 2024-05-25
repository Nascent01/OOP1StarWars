package command;

import cli.Command;
import universe.Universe;

public class Exit implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened()) {
            System.out.println("Open file first!");
        } else if (args.length != 1) {
            System.out.println("Usage: exit the app");
        } else {
            System.out.println("Exiting the app...");
            System.out.println("May the force be with you!");
            System.exit(0);
        }
    }
}
