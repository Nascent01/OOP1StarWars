package command;

import cli.Command;
import universe.Universe;

public class Open implements Command {

    @Override
    public void execute(String[] args) throws Exception {
        if (Universe.getInstance().isFileOpened()) {
            System.out.println("File already opened!");
        } else if (args.length != 1) {
            System.out.println("Usage: open <file.xml>");
        } else {
            if (!args[0].isEmpty()) {
                Universe.getInstance().readFromXml(args[0]);
            } else {
                System.out.println("You have to write file name");
            }
        }
    }
}
