package command;

import cli.Command;
import universe.Universe;

public class Open implements Command {
    @Override
    public void execute(String[] args) throws Exception {
        if (!Universe.getInstance().isFileOpened()) {
            Universe.getInstance().readFromXml(args[0]);
        } else if (args.length != 1) {
            System.out.println("Usage: open <file.xml>");
        }
        else {
            System.out.println("App already opened, please close it before opening another");
        }
    }
}
