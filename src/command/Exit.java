package command;

import cli.Command;
import universe.Universe;

public class Exit implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        if (Universe.getInstance().isFileOpened()) {
            System.out.println("Exiting the app");
            System.exit(0);
        } else {
            if (args.length != 1) {
                System.out.println("The command is exit");
            } else {
                System.out.println("No file is opened");
            }
        }
    }
}
